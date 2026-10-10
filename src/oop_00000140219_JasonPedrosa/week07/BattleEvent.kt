package oop_00000140219_JasonPedrosa.week07

sealed class battleState {
    data class MonsterEncounter(val monsterName: String) : battleState()
    data class LootDropped(val item: GameItem) : battleState()
    data class GameOver(val reason: String) : battleState()
    object SafeZone : battleState()
}