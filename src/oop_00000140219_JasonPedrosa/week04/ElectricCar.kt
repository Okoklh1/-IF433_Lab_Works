package oop_00000140219_JasonPedrosa.week04

class electricCar(
    brand: String,
    numberOfDoors: Int,
    val batteryCapacity: Int
) : car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}