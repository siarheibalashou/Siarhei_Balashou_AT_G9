package homework.day5.task1.playground.essense.craft.hand;

import homework.day5.task1.playground.essense.Matter;

public abstract class Container extends Matter {
    protected String name;

    public Container(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
