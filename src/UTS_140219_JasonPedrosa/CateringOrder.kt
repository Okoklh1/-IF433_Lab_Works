package UTS_140219_JasonPedrosa

class cateringOrder(
    val customer: Customer,
    var status: OrderStatus = OrderStatus.WAITING_LIST
) {
    private val orderItems: MutableList<Pair<CateringMenu, Int>> = mutableListOf()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order successfully added!")
    }

    fun printInvoice() {
        println("================ INVOICE ================")
        println("Customer: ${customer.name} (${customer.phone})")
        println("Delivery Address: ${customer.deliveryAddress}")
        println("Order Status: $status")

        var grandTotal = 0.0
        for ((index, pair) in orderItems.withIndex()) {
            val menu = pair.first
            val qty = pair.second
            print("${index + 1}. ")
            menu.printMenuDetails(qty)
            grandTotal += menu.calculateSubtotal(qty)
        }

        val grandTotalStr = String.format("%,.0f", grandTotal).replace(',', '.')
        println("GRAND TOTAL: Rp $grandTotalStr")
        println("=========================================")
    }
}