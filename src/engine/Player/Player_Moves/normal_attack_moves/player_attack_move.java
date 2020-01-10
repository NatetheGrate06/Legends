package engine.Player.Player_Moves.normal_attack_moves;

import engine.Items.weapons.weapon_stats.Weapon_damage.critical;
import engine.Stats.player_stats.player_attack;
import engine.Stats.player_stats.player_magic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static engine.Player.player_level.playerLevelBoost;
import static engine.Stats.player_stats.player_stat.playerAttack;

public class player_attack_move {

    public int attackMoveDamage;
    protected boolean didMoveCritical;
    //Heavy attack combo will be stronger
    public int heavyAttackDamage = (int) (playerLevelBoost + (player_attack.attackLevel * 1.4));
    public int jumpAttackDamage = player_attack.attackLevel * 1;
    public int lightAttackDamage = (int) (playerLevelBoost + player_attack.attackLevel * 1.3);
    public int combinedLightMagicDamage = (int) (player_attack.attackLevel + player_magic.magicLevel * 1.3);
    public boolean isPlayerAttacking;
    //TODO bind keys for this next section
    public player_attack_move heavyAttack;
    public player_attack_move lightAttack;
    public player_attack_move jumpAttack;
    public player_attack_move combinedLightMagicAttack;

    //TODO change the int to something else and finish this List
    public static int[] playerAttackMove; {
        ArrayList<Integer> playerAttackMoves = new ArrayList<>() {

        };
    }

    public void getAttackMoveDamage(int heavyAttackDamage, int lightAttackDamage,
                                    int jumpAttackDamage, int combinedLightMagicDamage) {
        this.heavyAttackDamage = heavyAttackDamage;
        this.lightAttackDamage = lightAttackDamage;
        this.jumpAttackDamage = jumpAttackDamage;
        this.combinedLightMagicDamage = combinedLightMagicDamage;
    }

    public void main(String[] args) {
        if (didMoveCritical = true) {
            System.out.println(critical.criticalHitDamage + "Critical Hit!!");
        } else {
            System.out.println(attackMoveDamage);
        }
        while (isPlayerAttacking = true) {
            getPlayerAttackMove(heavyAttack, lightAttack, jumpAttack, combinedLightMagicAttack);
        }
    }

    public void getPlayerAttackMove(player_attack_move heavyAttack, player_attack_move lightAttack,
                                    player_attack_move jumpAttack, player_attack_move combinedLightMagicAttack) {
        this.heavyAttack = heavyAttack;
        this.lightAttack = lightAttack;
        this.jumpAttack = jumpAttack;
        this.combinedLightMagicAttack = combinedLightMagicAttack;
    }
}
