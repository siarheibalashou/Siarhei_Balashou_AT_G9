package homework.day5.task1.playground.essense.craft.field;

import homework.day5.task1.playground.essense.Matter;
import homework.day5.task1.playground.essense.craft.Rideable;
import homework.day5.task1.playground.essense.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
