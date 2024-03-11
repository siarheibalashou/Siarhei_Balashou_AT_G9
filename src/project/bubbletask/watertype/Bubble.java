package project.bubbletask.watertype;

public class Bubble {
    private final double  BUBBLEVOLUME = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public double getVolume() {
        return BUBBLEVOLUME;
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

