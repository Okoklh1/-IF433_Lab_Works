package oop_00000140219_JasonPedrosa.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(20),
    RARE(8),
    EPIC(1),
    LEGENDARY(1)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)