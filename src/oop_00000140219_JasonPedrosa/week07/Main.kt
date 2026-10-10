package oop_00000140219_JasonPedrosa.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${databaseManager.connectionStatus}")
    databaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = networkClient.createClient() // Instansiasi lewat Factory
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = regularUser("Alice", 22)
    val reg2 = regularUser("Alice", 22)
    println(reg1) // Akan mencetak memori hash
    println("Sama? ${reg1 == reg2}") // False
}

