package oop_00000140219_JasonPedrosa.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${databaseManager.connectionStatus}")
    databaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = networkClient.createClient() // Instansiasi lewat Factory
    client.connect()
}