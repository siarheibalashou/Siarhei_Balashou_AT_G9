package homework.day5.task1.playground.essense.creatures;

import homework.day5.task1.playground.essense.Flyable;

public class Fly extends Insect implements Flyable {
    String name;
    public Fly(int mass, String name) {
        super(mass,name);
        this.name=name;
    }
    public void fly(String direction) {
        String flyMessage = "I am " + this.getClass().getSimpleName() + ", my name is " + this.name + " and I am flying to " + direction;
        System.out.println(flyMessage);
    }
}
