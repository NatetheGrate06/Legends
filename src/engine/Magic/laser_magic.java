package engine.Magic;

//TODO laser maximate summons a massive beam of energy that vaporizes nearby enemies
public class laser_magic extends Magic {

    protected laser_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(laserMagic, true, false, false, false, false, true, false, false);
    }

    public static laser_magic laserMagic;
}
