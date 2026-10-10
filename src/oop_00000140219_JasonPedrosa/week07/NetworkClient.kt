package oop_00000140219_JasonPedrosa.week07

class networkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}