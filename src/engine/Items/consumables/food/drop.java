package engine.Items.consumables.food;

import java.util.ArrayList;

public class drop {

    public drop dropper;

    public static boolean[] dropsFrom; {
        ArrayList<Boolean> dropsFrom = new ArrayList<>();
        dropsFrom.add(drop.dropsFromGrass);
        dropsFrom.add(drop.dropsFromDeadTree);
        dropsFrom.add(drop.dropsFromEnemy);
        dropsFrom.add(drop.canDigUp);
        dropsFrom.add(drop.dropsFromChest);
        dropsFrom.add(drop.dropsFromBoss);
        dropsFrom.add(drop.dropsFromBossChest);
        dropsFrom.add(drop.dropsFromVulture);
        dropsFrom.add(drop.dropsFromPet);
    }

    protected static boolean dropsFromGrass;
    protected static boolean dropsFromDeadTree;
    protected static boolean dropsFromEnemy;
    protected static boolean dropsFromChest;
    protected static boolean canDigUp;
    protected static boolean dropsFromBoss;
    protected static boolean dropsFromBossChest;
    protected static boolean dropsFromVulture;
    protected static boolean dropsFromPet;
}
