package UTS_140219_JasonPedrosa

interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}

abstract class CateringMenu(
    val name: String,
    initialMenuCode: String,
    initialBasePrice: Double
) : IBillable {

    var menuCode: String = initialMenuCode
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    var basePrice: Double = initialBasePrice
        set(value) {
            if (value >= 0.0) {
                field = value
            } else {
                println("[Error] Invalid price!")
            }
        }

    init {
        this.menuCode = initialMenuCode
        this.basePrice = initialBasePrice
    }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}