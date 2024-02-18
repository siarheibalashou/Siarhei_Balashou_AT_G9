package homework.day5.task1.playground.essense;

import homework.day5.task1.playground.essense.material.Pourable;
import homework.day5.task1.playground.essense.material.Powerable;

public abstract class Matter {
   protected int mass;

    public Matter(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
