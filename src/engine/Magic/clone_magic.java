package engine.Magic;

public class clone_magic extends Magic {

    protected clone_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(cloneMagic, false, false, false, false, true, false, true);
    }

    public static clone_magic cloneMagic;
}
