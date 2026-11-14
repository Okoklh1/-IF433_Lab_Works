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

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TRX001", 150000.0))
    txRepo.add(Transaction("TRX002", 250000.0))
    txRepo.add(Transaction("TRX003", 500000.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { transaction ->
        println("ID: ${transaction.id}")
        println("Amount: ${transaction.amount}")
        println("-------------------")
    }
}