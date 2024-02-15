package homework.day5.task1.playground.essense.creatures;

import homework.day5.task1.playground.essense.Matter;

import java.text.Format;

public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Plant food) {
        String animalName = getName();
        String foodName = food.toString();
        System.out.println("I am " + animalName + " I am eating " + foodName);

    }
}

