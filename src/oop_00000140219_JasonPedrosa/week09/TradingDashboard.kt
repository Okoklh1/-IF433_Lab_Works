package oop_00000140219_JasonPedrosa.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, 42.8, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 25, -12.4, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 15, 8.1, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 30, -3.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }

    println("Closed Trades: $closedTrades")
    println("Winning Trades: $winningTrades")
}