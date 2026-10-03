package oop_00000140219_JasonPedrosa.week06

class smartwatch : watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connectToBluetooth(){
        println("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magneti 15W.")
    }
}
