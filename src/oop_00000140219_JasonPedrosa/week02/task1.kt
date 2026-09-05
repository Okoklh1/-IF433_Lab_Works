package oop_00000140219_JasonPedrosa.week02

import java.util.Scanner

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
) {
    fun calculateFine(): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }
}

    fun main(){
        val scanner = Scanner(System.`in`)

        println("--- LIBRARY FINE SYSTEM ---")

        print("Masukkan Judul Buku: ")
        val bookTitle = scanner.nextLine()

        print("Masukkan Nama Peminjam: ")
        val borrower = scanner.nextLine()

        print("Masukkan Lama Pinjam (hari): ")
        var loanDuration = scanner.nextInt()

        if (loanDuration < 0) {
            loanDuration = 1
        }

        val loan = Loan(bookTitle, borrower, loanDuration)

        println("\n--- DETAIL PEMINJAMAN ---")
        println("Judul Buku: ${loan.bookTitle}")
        println("Peminjam: ${loan.borrower}")
        println("Lama Pinjam: ${loan.loanDuration} hari")
        println("Total Denda: Rp ${loan.calculateFine()}")
    }
