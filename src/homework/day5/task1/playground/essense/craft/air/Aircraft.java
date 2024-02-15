package homework.day5.task1.playground.essense.craft.air;

import homework.day5.task1.playground.essense.Flyable;
import homework.day5.task1.playground.essense.Matter;
import homework.day5.task1.playground.essense.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
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
