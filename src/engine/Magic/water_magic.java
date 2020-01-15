package engine.Magic;

public class water_magic extends Magic {

    //TODO water maximate summons a giant tsunami
    protected water_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(waterMagic, false, false, false, true, false, true, false, false);
    }

    public static water_magic waterMagic;
}
