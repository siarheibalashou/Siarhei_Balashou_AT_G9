package project.bubbletask.runners;

import project.bubbletask.boxing.Bottle;

public class BubbleRunner {
    public static void main(String[] args) {
        Bottle bottleOne = new Bottle(0.05);
        Bottle bottleTwo = new Bottle(0.1);
        Bottle bottleThree = new Bottle(0.2);
        bottleOne.open();
        bottleTwo.open();
        bottleThree.open();
    }
}
