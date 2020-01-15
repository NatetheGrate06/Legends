package engine.Magic;

public class storm_magic extends Magic {

    //TODO storm maximate summons a huge hurricane that swallows nearby enemies
    protected storm_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(stormMagic, false, false, false, true, false, true, false, false);
    }

    public static storm_magic stormMagic;
}
