package engine.ShopsAndItemValues.Shops.Snow_Shop;

import engine.ShopsAndItemValues.Shop_Items.item_value;

public class snow_shop_item_values extends item_value {

    protected snow_shop_item_values(int petCost, int weaponCost, int potionCost, Integer bombCost, Integer sandwichCost, int arrowCost, Integer secondPetCost, Integer secondWeaponCost) {
        super(455, 380, 18, null, 20, 13, 430, 400);
    }

    @Override
    protected void getShopCost(boolean hasPetCost, boolean hasWeaponCost, boolean hasPotionCost, boolean hasBombCost, boolean hasSandwichCost,
                               boolean hasArrowCost, boolean hasSecondPetCost, boolean hasSecondWeaponCost) {
        super.getShopCost(true, true, true, false,
                          true, true, true, true);
    }
}
