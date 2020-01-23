package engine.ShopsAndItemValues.Shops;

import Game_Levels.game_level;
import engine.ShopsAndItemValues.Shops.Castle_Shop.castle_shop;
import engine.ShopsAndItemValues.Shops.Cloud_Shop.cloud_shop;
import engine.ShopsAndItemValues.Shops.Dragon_Lair_Shop.dragon_lair_shop;
import engine.ShopsAndItemValues.Shops.Labyrinth_Shop.labyrinth_shop;
import engine.ShopsAndItemValues.Shops.Lake_Shop.lake_shop;
import engine.ShopsAndItemValues.Shops.Lava_Shop.lava_shop;
import engine.ShopsAndItemValues.Shops.Snow_Shop.snow_shop;
import engine.ShopsAndItemValues.Shops.Swamp_Shop.swamp_shop;

import java.util.ArrayList;

public class shop extends game_level {

    //TODO more shops to create i think
    public static shop shops; {
        ArrayList<shop> shops = new ArrayList<>();
        shops.add(cloud_shop.cloudShop);
        shops.add(castle_shop.castleShop);
        shops.add(dragon_lair_shop.dragonLairShop);
        shops.add(labyrinth_shop.labyrinthShop);
        shops.add(lake_shop.lakeShop);
        shops.add(lava_shop.lavaShop);
        shops.add(snow_shop.snowShop);
        shops.add(swamp_shop.swampShop);
    }
}
