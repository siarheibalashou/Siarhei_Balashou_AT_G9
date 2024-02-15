package homework.day5.task1.playground.essense.craft.air;

import homework.day5.task1.playground.essense.Matter;

public abstract class Aircraft extends Matter {
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
