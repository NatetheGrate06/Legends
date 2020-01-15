package engine.Magic;

//TODO nature maximate summons a tree monster
public class nature_magic extends Magic {

    protected nature_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(natureMagic, true, false, true, true, false, true, true, false);
    }

    public static nature_magic natureMagic;
}
