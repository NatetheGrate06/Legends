package engine.Magic;

//TODO pirate maximate summons a ton of cannons that blast the enemy and refills allies' stamina. grog is poisonous
public class pirate_magic extends Magic {

    protected pirate_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
        super(pirateMagic, false, true, false, false, false, true, true, true);
    }

    public static pirate_magic pirateMagic;
}
