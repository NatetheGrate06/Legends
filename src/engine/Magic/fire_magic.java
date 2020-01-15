package engine.Magic;

public class fire_magic extends Magic {

    //TODO fire maximate summons a volcanic storm that kills nearby enemies
    protected fire_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(fireMagic, false, true, false, false, false, true, false, false);
    }

    public static fire_magic fireMagic;
}
