package oop_00000140219_JasonPedrosa.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Smart Speaker $name ($id) dihidupkan. Siap mendengarkan perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker $name ($id) dimatikan.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}