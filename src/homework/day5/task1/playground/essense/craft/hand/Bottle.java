package homework.day5.task1.playground.essense.craft.hand;

import homework.day5.task1.playground.essense.material.Pourable;

public class Bottle extends Container implements Storable {
    private String name;

    public Bottle(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    @Override
    public int getMass() {
        return super.getMass();
    }


    public void store(Pourable pourable, int amount) {
        pourable.spread(name);
        System.out.printf("I am %s, my name is %s and I received %d of %s", this.getClass().getSimpleName(), name, amount, pourable.getClass().getSimpleName()).println();
        if (amount > getMass()) {
            System.out.println("wooh-wooh-wooh-hh..");
        }
    }
}
