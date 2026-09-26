package oop_00000140219_JasonPedrosa.week05

fun main() {
    val dosen1 = dosen("Pak Alex", "0123456")
    val admin1 = admin("Bu Siti")

    val daftarPegawai: List<pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI===")
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
}