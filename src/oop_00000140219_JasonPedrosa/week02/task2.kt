package oop_00000140219_JasonPedrosa.week02

import java.util.Scanner

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100
) {

    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage

        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- HERO BATTLE ---")

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()

    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(name, baseDamage)

    var enemyHp = 100

    println("\n${hero.name} memasuki pertarungan!")
    println("HP Hero: ${hero.hp}")
    println("HP Musuh: $enemyHp")

    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- MENU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Enemy")

            enemyHp -= hero.baseDamage

            if (enemyHp < 0) {
                enemyHp = 0
            }

            println("HP Musuh: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()

                println("Musuh menyerang balik dengan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)

                println("HP Hero: ${hero.hp}")
            }
        } else if (choice == 2) {
            println("${hero.name} memilih untuk kabur!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("\n--- HASIL PERTARUNGAN ---")

    if (enemyHp <= 0) {
        println("${hero.name} menang!")
    } else if (!hero.isAlive()) {
        println("Musuh menang!")
    } else {
        println("${hero.name} kabur dari pertarungan.")
    }

    println("HP Hero: ${hero.hp}")
    println("HP Musuh: $enemyHp")
}
