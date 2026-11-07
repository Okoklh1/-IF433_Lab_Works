package oop_00000140219_JasonPedrosa.week09

fun main() {
    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1, 2, 2, 3, 3, 4)
    println("Unique Numbers (Set): $uniqueNumbers") // Duplikat hilang[cite: 1]

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserA") // Diabaikan karena sudah ada[cite: 1]
    println("Active Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" // Value boleh duplikat, Key tidak[cite: 2]
    )
    println("Nilai Bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 // Menambah data baru[cite: 2]
    inventory["Apples"] = 45 // Mengupdate data lama[cite: 2]
    println("Inventory: $inventory")
}