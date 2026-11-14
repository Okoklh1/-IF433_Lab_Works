package oop_00000140219_JasonPedrosa.week10

interface Named {
    val name: String
}

class WalletRepository<T : Named> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(keyword: String): List<T> {
        return items.filter {
            it.name.contains(keyword, ignoreCase = true)
        }
    }
}