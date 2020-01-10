package engine.Player;

import engine.Stats.player_stats.player_stat;

import javax.swing.*;
import java.util.ArrayList;

import static engine.Stats.player_stats.player_stat.playerMagic;

public abstract class player {

    public static boolean notifyPlayer;
    public static double distanceRan;
    public static boolean isUsingMagic;
    public static boolean playerInLevel;
    public static boolean playerInMap;
    public static boolean playerInMenu;
    public static boolean playerInPauseMenu;
    public static boolean playerInModeSelect;
    public static boolean playerInSearch;
    public static boolean playerInCharacterSelect;
    public static boolean playerInSettings;
    public static boolean playerInTrophies;
    public static boolean playerInGame;
    public static boolean playerInCutscene;
    public static boolean playerInCredits;

    public static boolean[] playerState; {
        ArrayList<Boolean> playerState = new ArrayList<>();
        playerState.add(playerInLevel);
        playerState.add(playerInMap);
        playerState.add(playerInMenu);
        playerState.add(playerInPauseMenu);
        playerState.add(playerInModeSelect);
        playerState.add(playerInSearch);
        playerState.add(playerInCharacterSelect);
        playerState.add(playerInSettings);
        playerState.add(playerInTrophies);
        playerState.add(playerInGame);
        playerState.add(playerInCutscene);
        playerState.add(playerInCredits);
    }
    public static boolean isPlayerInLevel(boolean b) {
        return playerInLevel;
    }


}
