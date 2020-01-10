package engine.Stats.stat_bars;

import engine.Characters.playable_characters.special_characters.dragon_incarnate;

import javax.swing.*;
import java.awt.*;
import java.util.function.Function;

public class dragon_incarnate_ability_charge extends bar{

    public static double dragonCharge = charge.chargeSpeed()[1];
    public static double dragonDepletionSpeed = charge.depletionSpeed()[1];
    public Object dragonBar = new Dimension(50, 10);

    public Function showDragonBar() {
        return (Function) dragonBar;
    }

    public static double dragonChargeBossCounter() {
        return dragonCharge;
    }

    private Object main(String[] args) {
        if(dragon_incarnate.isDragonIncarnate = true) {
            return this.showDragonBar();
        }
        return true;
    }

}
