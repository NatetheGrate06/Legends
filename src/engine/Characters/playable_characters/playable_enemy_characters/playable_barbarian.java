package engine.Characters.playable_characters.playable_enemy_characters;

import Game_Levels.arenas.barbarian_arena;
import engine.unlocking_variables;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class playable_barbarian extends enemy_character {

    public static unlocking_variables unlockingBarbarian;
    public static ImageIcon barbarianInCharacterSelect = new ImageIcon(); {
        try {
            final BufferedImage image = ImageIO.read(new File("Art/src/In_Character_Select/barbarian_in_character_select.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    playable_barbarian(unlocking_variables unlockingVariable, ImageIcon characterSelect) {
        super(barbarian_arena.unlockingBarbarianArena, barbarianInCharacterSelect);
    }
}
