package project.bubbletask.watertype;

import project.bubbletask.interfaces.Transformable;

public abstract class Water implements Transformable {
    private String color = "no";
    private String transparency = "transparent";
    private int temperature = 0;
    private String smell = "no";


    public Water(String color, String transparency, int temperature, String smell) {
        this.color = color;
        this.transparency = transparency;
        this.temperature = temperature;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

}
