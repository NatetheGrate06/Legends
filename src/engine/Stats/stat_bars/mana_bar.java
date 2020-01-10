package engine.Stats.stat_bars;

import engine.Player.player;
import engine.Stats.player_stats.player_magic;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;

public class mana_bar extends bar {
    public static double manaCharge = charge.chargeSpeed()[3];
    public static double manaDepletion = charge.depletionSpeed()[4];
    public Object manaBar = new Dimension(50, 10);

    public Function showManaBar(boolean b) {
        if (player.isPlayerInLevel(true))
        this.showManaBar(true);
        return (Function) this.manaBar;
    }

    public mana_bar chargeMana() {
        do {
            this.chargeMana();
        } while (player.isUsingMagic = false);
        return player_magic.mana;
    }
}
