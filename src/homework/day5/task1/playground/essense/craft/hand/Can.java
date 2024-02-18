package homework.day5.task1.playground.essense.craft.hand;

import homework.day5.task1.playground.essense.material.Pourable;

public class Can extends Container implements Storable {
    protected String name;

    public Can(int mass, String name) {
        super(mass, name);
        this.name = name;

    }
    public void store(Pourable pourable, int amount) {
        pourable.spread(name);
        System.out.printf("I am %s, my name is %s and I received %d of %s", this.getClass().getSimpleName(), name, amount, pourable.getClass().getSimpleName()).println();
        if (amount > getMass()) {
            System.out.println( "waah-waah-waah-hh..");
        }
    }

}
