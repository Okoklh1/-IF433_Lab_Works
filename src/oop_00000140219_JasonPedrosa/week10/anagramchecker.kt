package oop_00000140219_JasonPedrosa.week10

fun isAnagram(str1: String, str2: String): Boolean {
    return str1.lowercase().toCharArray().sorted() == str2.lowercase().toCharArray().sorted()
}

fun main() {
    print("Masukkan kata pertama: ")
    val str1 = readLine()!!

    print("Masukkan kata kedua: ")
    val str2= readLine()!!

    if(isAnagram(str1, str2)){
        print("Anagram")
    } else
        print("Bukan Anagram")
}

