package homework.day5.task1.playground.essense.craft.field;

public class Moped extends Vehicle{
    protected String name;
    public Moped(int mass, String name) {
        super(mass, name);
        this.name=name;
    }
    public void drive(String direction) {
        String driveInfo = "I am " + this.getClass().getSimpleName() + ", my name is " + this.name + " and I am driving to " + direction;
        System.out.println(driveInfo);
    }
    public int move(int pointA, int pointB) {
        String moveMessage = "I am " + this.getClass().getSimpleName() + ", my name is " + this.name + " and I am moving from " + pointA + " to " + pointB;
        System.out.println(moveMessage);
        return pointB - pointA;
    }
}
