package project.bubbletask.boxing;

public class Bottle {
    private double volume;
    private Water water;
    SparklingWater waterSparkling = new SparklingWater("bad", "bad", 1, "fe");

    public Bottle(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void open() {
        Bubble[] newArray = waterSparkling.getBubbles();
        waterSparkling.bubbles = new Bubble[(int) (volume * 10000)];
        waterSparkling.pump(waterSparkling.bubbles);
        waterSparkling.degas();
    }
}

