package oop_00000140219_JasonPedrosa.week01

fun main() {
    val gameTitle = "Super Mario"
    val price = 500000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice
    )
}

fun calculateDiscount(price: Int) =
    if (price < 100000) 0
    else if (price <= 250000) price * 10 / 100
    else if (price <= 500000) price * 20 / 100
    else price * 30 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("=== SteamKW Receipt ===")
    println("Game Title : $title")
    println("Final Price: Rp$finalPrice")
}