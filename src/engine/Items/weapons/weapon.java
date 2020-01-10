package engine.Items.weapons;

public abstract class weapon {

    public weapon startingWeapon = isStartingWeapon(true);
    public weapon weapon;
    public abstract void getWeaponLevelRequirement(int i);

    public weapon isStartingWeapon(boolean b) {
        return this.startingWeapon;
    }

}
