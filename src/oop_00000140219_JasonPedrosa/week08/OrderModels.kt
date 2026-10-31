package oop_00000140219_JasonPedrosa.week08

class City(val name: String)
class Address(val city: City?)
class DeliverDetails(val address: Address?)
class Order(val deliveryDetails: DeliverDetails?, val totalPrice: Int?)

