package oop_00000140219_JasonPedrosa.week04

fun main() {
    println("\n--- Testing Manager ---")
    val manager = manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = developer("Andi", 8000000, "Python")
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}