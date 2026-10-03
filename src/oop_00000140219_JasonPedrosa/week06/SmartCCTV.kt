package oop_00000140219_JasonPedrosa.week06

class CCTVCamera(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("CCTV $name ($id) diaktifkan.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name ($id) dimatikan. Perekaman dihentikan.")
    }

    override fun startRecord() {
        println("Kamera CCTV $name mulai merekam video pengawasan...")
    }
}