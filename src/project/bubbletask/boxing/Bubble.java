package project.bubbletask.boxing;

public class Bubble {
    private double bubbleVolume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return bubbleVolume;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

}

