package oop_00000140219_JasonPedrosa.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin", 0.5))
    coinRepo.add(Coin("Ethereum", 2.0))

    println("All Coins:")
    println(coinRepo.getAll())

    println("Search Result:")
    println(coinRepo.searchByName("Bitcoin"))
}