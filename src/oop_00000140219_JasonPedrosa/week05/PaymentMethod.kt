package oop_00000140219_JasonPedrosa.week05

abstract class paymentMethod(
    val accountName: String
) {
    abstract fun processPayment(amount: Double)
}