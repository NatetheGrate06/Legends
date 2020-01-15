package engine.Stats.player_stats;

import java.util.ArrayList;

public class player_stat {

    //TODO get stat level boosts cleaned up
    //TODO entire package needs to be cleaned up
    public static int playerAgility;
    public static int playerAttack;
    public static int playerDefense;
    public static int playerMagic;
    public static int playerStamina;
    public static int playerMaximate;

    public static void main(String[] args) {
        ArrayList<Integer> stat = new ArrayList<>();
        stat.add(playerAgility);
        stat.add(playerAttack);
        stat.add(playerDefense);
        stat.add(playerMagic);
        stat.add(playerStamina);
        stat.add(playerMaximate);
    }
}
