package oop_00000140219_JasonPedrosa.week10

data class Coin(
    override val name: String,
    val balance: Double
) : Named

data class Transaction(
    val id: String,
    val amount: Double
) : Named {
    override val name: String
        get() = id
}