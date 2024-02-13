package project.bubbletask.boxing;

public class Bottle {
    private double volume;
    private Water water;
    SparklingWater waterSparkling = new SparklingWater("bad", "bad", 1, "fe");

    public Bottle(double volume, int temperature ) {
        temperature=this.water.getTemperature();
        setVolume(volume);
    }

    public Bottle(double volume) {
        this.volume=volume;
        setVolume(volume);

    }



    public void setVolume(double volume) {
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

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {

    }
}

