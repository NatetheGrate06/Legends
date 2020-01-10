package engine.Items.Armor.light_armor;

import engine.Stats.player_stats.player_agility;

import java.util.ArrayList;
import java.util.Random;

import static engine.Stats.player_stats.player_stat.playerDefense;

public class light_armor {

    public light_armor lightArmor;
    private int lightArmorAgilityDecrease = player_agility.agilityLevel - 3;
    public int lightArmorDefense = playerDefense + 10;
    public int lightArmorDurability;
    public light_armor poisonArmorRecoil;
    public light_armor lightningArmorRecoil;
    public light_armor darkArmorRecoil;
    public light_armor fireArmorRecoil;
    public light_armor iceArmorRecoil;
    public light_armor bombArmorRecoil;
    public light_armor dragonArmorRecoil;

    protected void getLightArmorLevelRequirement() {
    }

    //TODO work on this chance more
    Random rnd = new Random();
    int lightMagicRecoilChance = rnd.nextInt(100); {
        if(lightMagicRecoilChance < 8) {
            //DO
        }
    }

    protected void getLightArmorDurability() {
    }

    protected void getLightArmorRepairCost() {
    }

    //this is the code that will give light armor its magic
    protected void getLightMagicRecoil() {
        ArrayList<light_armor> lightMagicRecoil = new ArrayList<>();
        lightMagicRecoil.add(poisonArmorRecoil);
        lightMagicRecoil.add(lightningArmorRecoil);
        lightMagicRecoil.add(fireArmorRecoil);
        lightMagicRecoil.add(iceArmorRecoil);
        lightMagicRecoil.add(bombArmorRecoil);
        lightMagicRecoil.add(darkArmorRecoil);
        lightMagicRecoil.add(dragonArmorRecoil);
    }

}