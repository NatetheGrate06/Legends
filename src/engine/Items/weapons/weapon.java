package engine.Items.weapons;

import engine.Characters.character;
import engine.Items.weapons.weapon_stats.Weapon_damage.weapon_damage;

import static engine.Items.weapons.weapon_stats.Weapon_Magic.weapon_magic.getWeaponMagic;
import static engine.Items.weapons.weapon_stats.Weapon_Magic.weapon_magic.weaponMagic;
import static engine.Player.player_level.playerLevel;

public abstract class weapon {

    protected weapon(weapon weapon, boolean isStartingWeapon, int weaponDamage, boolean hasWeaponMagic, int weaponLevelRequirement) {
        this.weapon = weapon;
        this.isStartingWeapon = isStartingWeapon;
        weapon_damage.weaponDamage = weaponDamage;
        this.hasWeaponMagic = hasWeaponMagic;
        this.weaponLevelRequirement = weaponLevelRequirement;
    }

    public weapon startingWeapon;
    public  weapon weapon;
    public static int weaponLevelRequirement;
    public static boolean hasWeaponMagic; {
        if (hasWeaponMagic = true) {
            getWeaponMagic(weaponMagic);
        }
    }
    public boolean isStartingWeapon; {
        if (isStartingWeapon = true) {
            character.getWeaponsCharacter(character.character);
        }
    }

    public static int getWeaponLevelRequirement(int weaponLevelRequirement) {
        return playerLevel;
    }
}
