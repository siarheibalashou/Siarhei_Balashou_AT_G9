package BubbleTask;

import java.lang.invoke.VolatileCallSite;

public class SparklingWater extends Water {
    Bubble bubble = new Bubble("asd");
    Bubble[] bubbles = new Bubble[];
    Bottle bottleNew=new Bottle();

    public void pump(Bubble[] bubbles) {
        Water water;
        System.out.println("Вода заполнилась пузырями");
    }

    public void degas() {
        for (int i =bubbles.length; i > 0; i--) {
            System.out.println(i + " ");
            bubble.cramp();

        }
    }
}



