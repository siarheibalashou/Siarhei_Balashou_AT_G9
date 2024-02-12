package project.bubbletask.boxing;

public class SparklingWater extends Water {
    private boolean isOpened;
    Bubble[] bubbles;

    public SparklingWater(String color, String transparency, int temperature, String smell) {
        super(color, transparency, temperature, smell);
        isOpened();
    }

    public boolean isOpened() {
        return isOpened;

    }
    public void pump(Bubble[] bubbles){

    }
}
