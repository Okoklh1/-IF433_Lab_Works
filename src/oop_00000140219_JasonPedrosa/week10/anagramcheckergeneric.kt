package oop_00000140219_JasonPedrosa.week10

fun <T> isAnagram(word1: T, word2: T): Boolean {
    val str1 = word1.toString().lowercase().filter { it.isLetter() }.toList().sorted()
    val str2 = word2.toString().lowercase().filter { it.isLetter() }.toList().sorted()

    return str1 == str2
}

fun main() {
    print("Masukkan kata pertama: ")
    val word1 = readLine()!!

    print("Masukkan kata kedua: ")
    val word2 = readLine()!!

    println(if (isAnagram(word1, word2)) {
        "Anagram"
    } else {
        "Bukan Anagram"
    })
}