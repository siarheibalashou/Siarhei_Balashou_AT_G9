package BubbleTask;

public class Bottle {
    private double volume;
    Water water = new Water() {
        SparklingWater sparklingWater = new SparklingWater();
    };
    public Bottle(){
        this.volume=volume;
    }
    private int bubbleAmt = (int) (volume * 10000);

    public void open() {
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.degas(bubbleAmt);

    }

}

