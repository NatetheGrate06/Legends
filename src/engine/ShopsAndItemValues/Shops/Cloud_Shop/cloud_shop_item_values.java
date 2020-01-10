package engine.ShopsAndItemValues.Shops.Cloud_Shop;

import engine.ShopsAndItemValues.Shop_Items.item_value;

public class cloud_shop_item_values extends item_value {

    protected cloud_shop_item_values(int petCost, int weaponCost, int potionCost, int bombCost, int sandwichCost, int arrowCost) {
        super(820, 300, 18, 23, 25, 20, null, 320);
    }

    @Override
    protected void getShopCost(boolean hasPetCost, boolean hasWeaponCost, boolean hasPotionCost, boolean hasBombCost, boolean hasSandwichCost, boolean hasArrowCost, boolean hasSecondPetCost, boolean hasSecondWeaponCost) {
        super.getShopCost(true, true, true, true, true, true, false, true);
    }
}
