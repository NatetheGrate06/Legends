package engine.Magic;

public class dark_magic extends Magic {

    //TODO dark maximate can corrupt up to 5 enemies to fight for you and gives a magic boost for up to 30 seconds
    protected dark_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(darkMagic, false, true, false, false, false, true, false, true);
    }

    public static dark_magic darkMagic;
}
