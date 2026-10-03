package oop_00000140219_JasonPedrosa.week06

interface clickable {
    val name: String
    fun click()
}

class button(override val name: String) : clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}