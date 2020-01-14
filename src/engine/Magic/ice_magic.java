package engine.Magic;

public class ice_magic extends Magic{

    protected ice_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(iceMagic, true, false, false, false, false, true, false);
    }

    public static ice_magic iceMagic;
}
