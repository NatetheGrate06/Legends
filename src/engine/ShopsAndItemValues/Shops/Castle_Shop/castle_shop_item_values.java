package engine.ShopsAndItemValues.Shops.Castle_Shop;

import engine.ShopsAndItemValues.Shop_Items.item_value;

public class castle_shop_item_values extends item_value {

    protected castle_shop_item_values(int petCost, int weaponCost, int potionCost, int bombCost, int sandwichCost, int arrowCost) {
        super(200, 32,12, null, null, 8, null, null);
    }

    @Override
    protected void getShopCost(boolean hasPetCost, boolean hasWeaponCost, boolean hasPotionCost, boolean hasBombCost,
                               boolean hasSandwichCost, boolean hasArrowCost, boolean hasSecondPetCost, boolean hasSecondWeaponCost) {
        super.getShopCost(true, true, true, false, false, true, false, false);
    }
}
