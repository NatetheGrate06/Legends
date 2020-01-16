package engine.Stats.stat_bars;

import engine.Player.player;
import engine.Stats.player_stats.player_magic;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;

import static engine.Magic.maximate.maximateManaBoost;

public class mana_bar extends bar {
    public static double manaCharge = charge.chargeSpeed()[3];
    //Takes 1/4 of your mana every time you use a primary magic attack or 1/5 magic per second using other magic
    public static double manaDepletion = charge.depletionSpeed()[4]; {
        if (maximateManaBoost == maximateManaBoost) {
            manaDepletion = 0;
        }
    }

    public Object manaBar = new Dimension(50, 10);

    @Override
    public Function showBar(engine.Stats.stat_bars.bar bar) {
        return super.showBar((engine.Stats.stat_bars.bar) manaBar);
    }

    public mana_bar chargeMana() {
        do {
            this.chargeMana();
        } while (player.isUsingMagic = false);
        return player_magic.mana;
    }
}
