package homework.day5.task1.playground.essense.creatures;

import homework.day5.task1.playground.essense.Matter;

public abstract class Plant extends Matter {
    protected String name;
    public Plant(int mass, String name) {
        super(mass);
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
