package project.bubbletask.runners;

import project.bubbletask.boxing.Bottle;
import project.bubbletask.boxing.SparklingWater;

public class BubbleRunner {
    public static void main(String[] args) {
        SparklingWater sparklingWater = new SparklingWater("123","3333",12,"1333");
        Bottle bottleOne = new Bottle(0.02);
        bottleOne.open();
    }
}
