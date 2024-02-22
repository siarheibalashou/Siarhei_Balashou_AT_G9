package homework.day5.task1.playground.essense.craft.air;

import java.io.Serial;
import java.io.Serializable;

public class Copter extends Aircraft implements Serializable {
    private String name;

    public Copter(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    public void fly(String direction) {
        String flyMessage = "I am " + this.getClass().getSimpleName() + ", my name is " + this.name + " and I am flying to " + direction;
        System.out.println(flyMessage);
    }
    public int move(int pointA, int pointB) {
        String moveMessage = "I am " + this.getClass().getSimpleName() + ", my name is " + this.name + " and I am moving from " + pointA + " to " + pointB;
        System.out.println(moveMessage);
        return pointB - pointA;
    }

}
