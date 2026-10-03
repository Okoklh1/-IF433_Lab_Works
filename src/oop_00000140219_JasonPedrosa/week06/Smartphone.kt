package oop_00000140219_JasonPedrosa.week06

class smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistm operasi Smartphone berhasil booting.")
    }
}