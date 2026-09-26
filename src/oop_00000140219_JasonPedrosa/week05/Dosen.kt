package oop_00000140219_JasonPedrosa.week05

class dosen(nama: String, val nidn: String) : pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}