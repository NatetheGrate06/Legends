package engine.Magic;

public class song_magic extends Magic {

    //TODO song maximate puts nearby enemies to sleep with a melody
    protected song_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(songMagic, true, false, false, true, false, true, false, false);
    }

    public static song_magic songMagic;
}
