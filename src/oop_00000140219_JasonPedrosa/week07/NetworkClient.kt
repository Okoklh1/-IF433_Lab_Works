package oop_00000140219_JasonPedrosa.week07

class networkClient private constructor(val url: String) {

    companion object {
        const val BASE_URL = "https://api.umn.ac.id" // Shared constant

        fun createClient(): networkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return networkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}
