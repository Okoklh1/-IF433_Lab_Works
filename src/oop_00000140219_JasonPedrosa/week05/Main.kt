package oop_00000140219_JasonPedrosa.week05

fun main() {
    val dosen1 = dosen("Pak Alex", "0123456")
    val admin1 = admin("Bu Siti")

    val daftarPegawai: List<pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("--------------------------")
    }

    println("\n=== Tugas Mandiri 1 ===")

    val Math = mathHelper()

    println("Luas Persegi: ${Math.hitungLuas(10)}")
    println("Luas Persegi Panjang: ${Math.hitungLuas(10, 5)}")
    println("Luas Lingkaran: ${Math.hitungLuas(7.0)}")

    println("--------------------------")

    println("\n=== Tugas Mandiri 2 ===")

    val eWallet = eWallet("Jason", 50000.0)
    val creditCard = creditCard("Jason", 100000.0)

    val paymentMethods: List<paymentMethod> = listOf(eWallet, creditCard)

    for (paymentMethod in paymentMethods) {
        println("Account: ${paymentMethod.accountName}")

        paymentMethod.processPayment(75000.0)

        if (paymentMethod is eWallet) {
            paymentMethod.topUp(50000.0)
            paymentMethod.processPayment(75000.0)
        }

        println("--------------------------")
    }
}