package project.bubbletask.boxing;

import project.bubbletask.boxing.interfaces.Transformable;
import project.bubbletask.materials.Material;

public abstract class Vessel implements Transformable {
    private double volume;
    private double diameter;
    private int weight;
    private Material material;
    protected Transformable stuff;

    public Vessel(double volume, double diameter, Material material) {
        this.volume = volume;
        this.diameter = diameter;
        this.material = material;
        weight = (int) (volume * material.getDensity() / diameter);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
