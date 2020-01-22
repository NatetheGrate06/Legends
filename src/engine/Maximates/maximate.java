package engine.Maximates;

public class maximate {

    //maximates don't affect bosses
    public maximate maximate;
    public static int maximateRecharge;
    public static maximate maximateManaBoost;
    public static maximate maximateStaminaBoost;
    public static maximate maximateDefenseBoost;
    public static maximate maximateAgilityBoost;

    protected maximate(maximate maximate, int getRecharge, Integer getRadius) {
        this.getMaximate();
        this.getMaximateRecharge();
        this.getMaximateRadius();
    }

    private void getMaximateRadius() {
    }

    private void getMaximateRecharge() {
    }

    private maximate getMaximate() {
        return this.maximate;
    }
}
