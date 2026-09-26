package oop_00000140219_JasonPedrosa.week05

class creditCard(
    accountName: String,
    val limit: Double,
    var usedAmount: Double = 0.0
) : paymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil sebesar Rp$amount")
            println("Limit terpakai: Rp$usedAmount")
        } else {
            println("Transaksi ditolak")
        }
    }
}