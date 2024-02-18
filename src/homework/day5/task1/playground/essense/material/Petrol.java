package homework.day5.task1.playground.essense.material;

import homework.day5.task1.playground.essense.Matter;

public class Petrol extends Matter implements Pourable, Powerable {

    protected int mass;

    public Petrol(int mass) {
        super(mass);
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s", this.getClass().getSimpleName(), storeName).println();
        System.out.println("wheeh..");
    }
}
