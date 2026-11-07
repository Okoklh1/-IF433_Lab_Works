package oop_00000140219_JasonPedrosa.week08

class notificationService{
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: userProfile){
        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}
