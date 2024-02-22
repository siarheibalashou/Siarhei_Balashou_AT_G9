package project.bubbletask.runners;

import project.bubbletask.boxing.Bottle;
import project.bubbletask.materials.Metal;

public class BubbleRunner {
    public static void main(String[] args) {
        Bottle bottleOne = new Bottle(0.05,12, new Metal());
        Bottle bottleTwo = new Bottle(0.1,12, new Metal());
        Bottle bottleThree = new Bottle(0.2,12, new Metal());
        bottleOne.open();
        bottleTwo.open();
        bottleThree.open();
    }
}
