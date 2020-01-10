package engine.ShopsAndItemValues.Shops.Swamp_Shop;

import engine.ShopsAndItemValues.Shop_Items.item_value;

public class swamp_shop_item_values extends item_value {

    protected swamp_shop_item_values(int petCost, int weaponCost, int potionCost, Integer bombCost, Integer sandwichCost,
                                     int arrowCost, Integer secondPetCost, Integer secondWeaponCost) {
        super(290, 310, 11, 19, null, 9,
              null, 275);
    }

    @Override
    protected void getShopCost(boolean hasPetCost, boolean hasWeaponCost, boolean hasPotionCost, boolean hasBombCost,
                               boolean hasSandwichCost, boolean hasArrowCost, boolean hasSecondPetCost, boolean hasSecondWeaponCost) {
        super.getShopCost(true, true, true, true,
                          false, true, false, true);
    }
}