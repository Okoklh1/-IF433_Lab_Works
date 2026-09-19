package oop_00000140219_JasonPedrosa.week04

open class car(brand: String, val numberOfDoors: Int) : vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk(){
        println("TIN TIN! Mobil $brand lewat!")
    }
}