package engine.Magic;

public class sand_magic extends Magic {

    //TODO sand maximate makes nearby enemies into sand castles and turns the ground underneath them into quicksand and the hole swallows them
    protected sand_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(sandMagic, false, false, false, false, true, true, false, false);
    }

    public static sand_magic sandMagic;
}
