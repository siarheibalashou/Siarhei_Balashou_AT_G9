package homework.day5.task1.playground.essense.craft.air;

public class Plane extends Aircraft {
    public Plane(int mass, String name) {
        super(mass, name);
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
