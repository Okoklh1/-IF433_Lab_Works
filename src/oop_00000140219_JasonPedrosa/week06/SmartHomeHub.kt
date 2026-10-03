package oop_00000140219_JasonPedrosa.week06

class smartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat ${device.name} (${device.id}) berhasil ditambahkan ke hub.")
    }

    fun turnOffAllSwitches() {
        println("Mematikan semua perangkat yang dapat dialihkan (Switchable)...")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}