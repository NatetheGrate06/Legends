package engine.Magic;

import engine.Characters.playable_characters.Knights.PinkKnight

public class rainbow_magic extends Magic {

    //TODO rainbow maximate summons pink creatures underneath the enemies and the creatures swallow them, but in a funny way
    protected rainbow_magic(Magic magic, boolean isParalyzing, boolean isLingering, boolean isLeeching, boolean isEnemyManipulating, boolean isPlayerStateAltering, boolean doesShootProjectile, boolean doesSummonEntity) {
        super(rainbowMagic, true, false, false, true, false, true, true, false);
    }

    public static rainbow_magic rainbowMagic;
}
