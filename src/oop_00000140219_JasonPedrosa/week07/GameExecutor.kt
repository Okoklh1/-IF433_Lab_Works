package oop_00000140219_JasonPedrosa.week07

fun processEvent(event: battleState) {
    when (event) {
        is battleState.MonsterEncounter -> {
            println("Bahaya! Bertemu dengan monster: ${event.monsterName}. Bersiap untuk bertarung!")
        }
        is battleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Berhasil mendapatkan loot! Item: $name, Damage: $damage, Kelangkaan: $rarity (Drop Chance: ${rarity.dropChance}%)")
        }
        is battleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
        is battleState.SafeZone -> {
            println("Anda memasuki SafeZone. Area aman untuk memulihkan diri.")
        }
    }
}