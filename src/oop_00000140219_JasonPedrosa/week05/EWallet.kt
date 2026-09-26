package oop_00000140219_JasonPedrosa.week05

class EWallet(
    accountName: String,
    var balance: Double
) : paymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran berhasil sebesar Rp$amount")
            println("Sisa saldo: Rp$balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top up berhasil sebesar Rp$amount")
        println("Saldo sekarang: Rp$balance")
    }
}