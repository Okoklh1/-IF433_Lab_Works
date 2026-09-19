package oop_00000140219_JasonPedrosa.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = car("Toyota")
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}