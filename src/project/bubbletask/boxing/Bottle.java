package project.bubbletask.boxing;

import project.bubbletask.interfaces.Containable;
import project.bubbletask.interfaces.Transformable;
import project.bubbletask.watertype.Bubble;
import project.bubbletask.watertype.SparklingWater;
import project.bubbletask.watertype.Water;

public class Bottle extends Vessel implements Containable {
    private double volume;
    private Water water;
    SparklingWater waterSparkling = new SparklingWater("bad", "bad", 1, "fe");

    public Bottle(double volume, int temperature) {
        super();
        temperature = this.water.getTemperature();
        setVolume(volume);
    }


    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void open() {
        waterSparkling.pump(new Bubble[(int) (volume * 10000)]);
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

    private void setBubbles() {

    }

    @Override
    public void addStuff(Transformable stuff) {
        if (stuff instanceof SparklingWater) {
            setBubbles();
        }
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}

