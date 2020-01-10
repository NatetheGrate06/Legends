package engine.Stats.player_stats;

import engine.Stats.stat_bars.attack_point_bar;

import java.util.ArrayList;

import static engine.Stats.stat_bars.attack_point_bar.ATTACK_SLOTS;

public class player_attack extends player_stat {

    public int attack;
    public static int attackLevel;
    public static int filledAttackSlot;

    public static int getPlayerAttack() {
        return playerAttack;
    }

    public Object attackSlots; {
        ArrayList<attack_point_bar> attackSlots = new ArrayList<>();
        attackSlots.add(ATTACK_SLOTS);
    }

    public static int getFilledAttackSlots(ArrayList attackSlots) {
        return filledAttackSlot;
    }
}
