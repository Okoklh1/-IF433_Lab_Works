package oop_00000140219_JasonPedrosa.week03

fun main() {
    val senjata = weapon("Pistol")

    senjata.damage = -50
    println("Damage: ${senjata.damage}")
    senjata.damage = 9999
    println("Damage: ${senjata.damage}")

    println("Tier: ${senjata.tier}")
}