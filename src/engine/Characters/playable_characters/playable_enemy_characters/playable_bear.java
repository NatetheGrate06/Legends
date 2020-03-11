package engine.Characters.playable_characters.playable_enemy_characters;

import engine.unlocking_variables;

import javax.swing.*;

public class playable_bear extends enemy_character {
    playable_bear(unlocking_variables unlockingVariable) {
        super(playable_skeleton.unlockingPlayableSkeleton, bearInCharacterSelect);
    }

    public static ImageIcon bearInCharacterSelect = new ImageIcon("E:/Legends/Art/src/In_Character_Select/bear_in_character_select.png");
}
