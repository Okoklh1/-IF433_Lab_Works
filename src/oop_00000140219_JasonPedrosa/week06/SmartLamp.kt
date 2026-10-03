package oop_00000140219_JasonPedrosa.week06

class smartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Lampu $name ($id) dinyalakan. Ruangan kini menjadi terang.")
    }

    override fun turnOff() {
        println("Lampu $name ($id) dimatikan. Ruangan kembali gelap.")
    }
}