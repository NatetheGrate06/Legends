package engine.Stats.enemy_stats;

import java.util.ArrayList;
import java.util.List;

public enum enemy_stat {

    ENEMY_STAT;

    public static double enemyAgility = enemy_agility.getEnemyAgility();
    public static double enemyAttack = enemy_attack.getEnemyAttack();
    public static double enemyDefense = enemy_defense.getEnemyDefense();
    public static double enemyMagic = enemy_magic.getEnemyMagic();
    public static double enemyStamina = enemy_stamina.getEnemyStamina();

    public static void main(String[] args) {
        List<Double> stat = new ArrayList<>();
        stat.add(enemyAgility);
        stat.add(enemyAttack);
        stat.add(enemyDefense);
        stat.add(enemyMagic);
        stat.add(enemyStamina);
    }

}
