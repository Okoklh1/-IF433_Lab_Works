package oop_00000140219_JasonPedrosa.week06

class Gopay : paymentMethod {
    override fun pay(amount: Double) { println("Processing Rp$amount via Gopay Server") }
}

class CreditCard : paymentMethod {
    override fun pay(amount: Double) { println("Contacting Bank for Rp$amount") }
}