package oop_00000140219_JasonPedrosa.week09

fun main() {
    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang[cite: 1]

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada[cite: 1]
    println("Active Users: $activeUsers")
}