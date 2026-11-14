package oop_00000140219_JasonPedrosa.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 100.0))

    println("All Coins:")
    println(coinRepo.getAll())

    println("Search Result:")
    println(coinRepo.searchByName("Bitcoin"))
}