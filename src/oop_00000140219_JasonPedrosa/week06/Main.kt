package oop_00000140219_JasonPedrosa.week06

fun processCheckout(method: paymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = smartwatch()
    myWatch.showTime()

    val myPhone = smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    println("\n=== TESTING SMART HOME SYSTEM ===")

    val livingRoomLamp = smartLamp("LAMP-01", "Ruang Tamu")
    val kitchenSpeaker = smartSpeaker("SPK-01", "Google Nest Dapur")
    val garageCCTV = CCTVCamera("CCTV-01", "Ezviz Garasi")

    val homeHub = smartHomeHub()

    homeHub.addDevice(livingRoomLamp)
    homeHub.addDevice(kitchenSpeaker)
    homeHub.addDevice(garageCCTV)

    println("\n--- PENGUJIAN MENYALAKAN PERANGKAT ---")
    livingRoomLamp.turnOn()
    kitchenSpeaker.turnOn()
    garageCCTV.turnOn()

    println("\n--- PENGUJIAN AKTIVASI SECURITY MODE PADA HUB ---")
    homeHub.activateSecurityMode()

    println("\n--- PENGUJIAN MEMATIKAN SEMUA SAKELAR (SWITCHABLE) ---")
    homeHub.turnOffAllSwitches()
}