package oop_00000140219_JasonPedrosa.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")

    response.data.forEach { coin ->
        println("Name: ${coin.name}")
        println("Balance: ${coin.balance}")
        println("-------------------")
    }
}