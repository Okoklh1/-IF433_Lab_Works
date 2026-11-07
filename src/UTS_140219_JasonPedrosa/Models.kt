package UTS_140219_JasonPedrosa

enum class OrderStatus {
    WAITING_LIST,
    COOKING,
    DELIVERED
}

data class Customer(
    val name: String,
    val phone: String,
    val deliveryAddress: String
)