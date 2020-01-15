package engine.Player;

import engine.Stats.player_stats.player_stat;

import javax.swing.*;
import java.util.ArrayList;

import static engine.Stats.player_stats.player_stat.playerMagic;

public class player {

    public static boolean notifyPlayer;
    public static double distanceRan;
    public static boolean isUsingMagic;
    public static playerState playerInLevel;
    public static playerState playerInMap;
    public static playerState playerInMenu;
    public static playerState playerInPauseMenu;
    public static playerState playerInModeSelect;
    public static playerState playerInSearch;
    public static playerState playerInCharacterSelect;
    public static playerState playerInSettings;
    public static playerState playerInTrophies;
    public static playerState playerInGame;
    public static playerState playerInCutscene;
    public static playerState playerInCredits;
    public static boolean isPlayerInLevel;
    public static int damagePerHit;

    public static class playerState {

        public playerState[] playerState;{
            ArrayList<playerState> playerState = new ArrayList<>();
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

        public static playerState normalPlayerState = playerInLevel;
        public static player.playerState[] alteredPlayerState;
        public static playerState playerInSpinningMagicAttack;



        public playerState isPlayerInLevel(boolean b) {
            return playerInLevel;
        }
    }

    public static class playerCharacterState extends playerState {

        public static playerCharacterState playerCharacterState;
        public static boolean isNormalPlayerState;

        {
            ArrayList<player.playerState> playerCharacterState = new ArrayList<>();
            playerCharacterState.add(normalPlayerState);
            playerCharacterState.add(playerInSpinningMagicAttack);
        }
    }
}
