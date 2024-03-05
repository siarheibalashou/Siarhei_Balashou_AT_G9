package project.bubbletask.boxing;

import project.bubbletask.interfaces.Containable;
import project.bubbletask.interfaces.Transformable;
import project.bubbletask.materials.Material;
import project.bubbletask.watertype.Bubble;
import project.bubbletask.watertype.SparklingWater;
import project.bubbletask.watertype.Water;

public class Bottle extends Vessel implements Containable {
    private double volume;
    private Water water;
    SparklingWater waterSparkling = new SparklingWater("bad", "bad", 1, "fe");

    public Bottle(double volume, double diameter, Material material) {
        super(volume, diameter, material);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
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

    public void open() {
        if (waterSparkling instanceof SparklingWater) {
            waterSparkling.pump(new Bubble[(int) (volume * 10000)]);
            waterSparkling.degas();
        }
    }

    private void setBubbles() {

    }

    @Override
    public void addStuff(Transformable stuff) {
        if (stuff instanceof SparklingWater) {
            System.out.printf("Adding %s into Bottle", stuff.getClass().getSimpleName()).println();
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

