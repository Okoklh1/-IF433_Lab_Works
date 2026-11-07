package UTS_140219_JasonPedrosa

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val packagingFee: Double = 3000.0
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotalStr = String.format("%,.0f", calculateSubtotal(quantity)).replace(',', '.')
        println("[FOOD] $menuCode - $name")
        println("Qty: $quantity portions | Subtotal: Rp $subtotalStr")
    }
}

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val actualPrice = if (isLargeSize) basePrice + 5000.0 else basePrice
        return actualPrice * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val sizeLabel = if (isLargeSize) "Large" else "Regular"
        val subtotalStr = String.format("%,.0f", calculateSubtotal(quantity)).replace(',', '.')
        println("2. [DRINK] $menuCode - $name ($sizeLabel)")
        println("Qty: $quantity cups | Subtotal: Rp $subtotalStr")
    }
}