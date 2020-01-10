package engine.Items.Armor.light_armor;

import engine.Characters.playable_characters.playable_enemy_characters.enemy_character;
import engine.Stats.player_stats.player_agility;

import javax.swing.*;
import java.util.Random;

import static engine.Stats.player_stats.player_stat.playerDefense;

public class light_armor {

    public light_armor lightArmor;
    private int lightArmorAgilityDecrease = player_agility.agilityLevel - 3;
    public int lightArmorDefense = playerDefense + 10;
    public int lightArmorDurability;

    //TODO work on this chance more
    Random rnd = new Random();
    int lightMagicRecoilChance = rnd.nextInt(100); {
        if(lightMagicRecoilChance < 8) {

        } while (enemy_character.isEnemyAttacking = true) {
        } throw (armorMagic);
    }

    protected void getLightArmorDurability() {
    }

    protected void getLightArmorRepairCost() {
    }

    protected void getLightMagicRecoil() {

    }

}