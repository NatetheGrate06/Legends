package engine.Magic;

public class summoning_magic extends Magic {

    //TODO summoning maximate creates beefy characters for 8 seconds
    protected summoning_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(summoningMagic, false, false, false, true, false, true, true, false);
    }

    public static summoning_magic summoningMagic;
}
