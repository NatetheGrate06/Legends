package engine.Items.weapons.weapon_stats.Weapon_damage;

import static engine.Player.player_level.playerLevel;

public class weapon_damage {

    public static int weaponDamage;
    public static int initialWeaponDamage;
    public static int weaponDamageLevelBoost = playerLevel * 2;

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public int getInitialWeaponDamage() {
        return initialWeaponDamage;
    }
}
