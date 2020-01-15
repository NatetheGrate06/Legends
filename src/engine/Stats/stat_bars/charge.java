package engine.Stats.stat_bars;

import engine.Stats.player_stats.player_defense;

import java.util.*;

import static engine.Stats.enemy_stats.enemy_stat.enemyAttack;
import static engine.Stats.stat_bars.dragon_incarnate_ability_charge.dragonChargeBossCounter;

public enum charge {

    CHARGE;

    //TODO whole package needs cleanup
    public static double[] charge; {
        ArrayList<Double> charge = new ArrayList<>();
        charge.add(maximate_charge_bar.maximateCharge);
        charge.add(dragon_incarnate_ability_charge.dragonCharge);
        charge.add(stamina_bar.staminaCharge);
        charge.add(mana_bar.manaCharge);
        charge.add(player_health_bar.healthCharge);
    }

    public static double[] chargeSpeed() {
        chargeSpeed()[0] = 2.4;
        chargeSpeed()[1] = dragonChargeBossCounter() * 2;
        chargeSpeed()[2] = 5;
        chargeSpeed()[3] = 5;
        chargeSpeed()[4] = 4;
        return charge;
    }

    public static double[] depletion; {
        ArrayList<Double> depletion = new ArrayList<>();
        depletion.add(maximate_charge_bar.maximateDepletionSpeed);
        depletion.add(dragon_incarnate_ability_charge.dragonDepletionSpeed);
        depletion.add(stamina_bar.staminaDepletion);
        depletion.add(mana_bar.manaDepletion);
        depletion.add(player_health_bar.healthDepletion);
    }

    public static double[] depletionSpeed() {
        depletionSpeed()[0] = 2.1;
        depletionSpeed()[1] = dragonChargeBossCounter();
        depletionSpeed()[2] = 3;
        depletionSpeed()[3] = 3;
        depletionSpeed()[4] = enemyAttack;
        return depletion;
    }

}
