package engine.Characters.playable_characters.playable_enemy_characters;

import Game_Levels.boss_levels.cyclops_boss_level;
import engine.unlocking_variables;

public class playable_cyclops_minion extends enemy_character {
    playable_cyclops_minion(unlocking_variables unlockingVariable) {
        super(cyclops_boss_level.unlockingCyclopsBossLevel);
    }
}
