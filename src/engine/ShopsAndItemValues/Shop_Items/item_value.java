package engine.ShopsAndItemValues.Shop_Items;

public class item_value {

    protected int petCost;
    protected int weaponCost;
    protected int potionCost;
    protected int bombCost;
    protected int sandwichCost;
    protected int arrowCost;
    protected int secondPetCost;
    protected int secondWeaponCost;
    public boolean hasShopCost;

    protected item_value(int petCost, int weaponCost, int potionCost, Integer bombCost, Integer sandwichCost, int arrowCost, Integer secondPetCost, Integer secondWeaponCost) {
        this.petCost = petCost;
        this.weaponCost = weaponCost;
        this.potionCost = potionCost;
        this.bombCost = bombCost;
        this.sandwichCost = sandwichCost;
        this.arrowCost = arrowCost;
        this.secondPetCost = secondPetCost;
        this.secondWeaponCost = secondWeaponCost;
    }

    protected boolean hasPetCost;
    protected boolean hasWeaponCost;
    protected boolean hasPotionCost;
    protected boolean hasBombCost;
    protected boolean hasSandwichCost;
    protected boolean hasArrowCost;
    protected boolean hasSecondPetCost;
    protected boolean hasSecondWeaponCost;

    protected void getShopCost(boolean hasPetCost, boolean hasWeaponCost, boolean hasPotionCost, boolean hasBombCost,
                                boolean hasSandwichCost, boolean hasArrowCost, boolean hasSecondPetCost, boolean hasSecondWeaponCost) {
        this.hasPetCost = hasPetCost;
        this.hasWeaponCost = hasWeaponCost;
        this.hasPotionCost = hasPotionCost;
        this.hasBombCost = hasBombCost;
        this.hasSandwichCost = hasSandwichCost;
        this.hasArrowCost = hasArrowCost;
        this.hasSecondPetCost = hasSecondPetCost;
        this.hasSecondWeaponCost = hasSecondWeaponCost;
    }
}

