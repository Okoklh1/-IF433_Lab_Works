package oop_00000140219_JasonPedrosa.week03

fun main() {
    val pemain = player("Budi")

    pemain.addXp(50)
    println("Level: ${pemain.level}")

    pemain.addXp(60)
    println("Level: ${pemain.level}")
}