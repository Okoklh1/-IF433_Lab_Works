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

    println("\n=== TEST DATA CLASS ===")
    val data1 = dataUser("Alice", 22)
    val data2 = dataUser("Alice", 22)
    println(data1) // Otomatis readable format
    println("Sama? ${data1 == data2}") // True (Structural Equality)

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1 // Destructuring Declaration
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)

    println("=== SIMULASI GAME MANAGER (SINGLETON) ===")
    gameManager.startGame()
    gameManager.startGame()

    println("\n=== SIMULASI FACTORY & ENUM ===")
    println("Drop Chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal Dibuat: ${starterWeapon.item.name} (Damage: ${starterWeapon.item.damage}, Rarity: ${starterWeapon.item.rarity}, Durability: ${starterWeapon.durability})")

    println("\n=== SIMULASI UPGRADE & EVENT PERTARUNGAN ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(battleState.SafeZone)
    processEvent(battleState.MonsterEncounter("Goblin Nakal"))
    processEvent(battleState.LootDropped(upgradedItem))
    processEvent(battleState.GameOver("Terkena jebakan racun"))
}