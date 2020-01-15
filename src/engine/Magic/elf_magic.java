package engine.Magic;

//TODO elf maximate summons a forest stampede and secondary magic summons a squirrel that attacks the enemy
public class elf_magic extends Magic {

    protected elf_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity, boolean isBoosting) {
        super(elfMagic, false, true, false, false, false, true, true, false);
    }

    public static elf_magic elfMagic;
}
