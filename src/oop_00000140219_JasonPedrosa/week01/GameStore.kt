package oop_00000140219_JasonPedrosa.week01

fun main() {
    val gameTitle = "Super Mario"
    val price = 500000


}

fun calculateDiscount(price: Int) =
    if (price < 100000) 0
    else if (price <= 250000) price * 10 / 100
    else if (price <= 500000) price * 20 / 100
    else price * 30 / 100
