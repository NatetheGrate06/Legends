package engine.Magic;

//TODO clerk maximate refills everybody's potions and gives everyone a defense boost for up to 30 seconds, but the recharge costs more
public class clerk_magic extends Magic {

    protected clerk_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(clerkMagic, false, true, false, false, false, true, false, true);
    }

    public static clerk_magic clerkMagic;
}
