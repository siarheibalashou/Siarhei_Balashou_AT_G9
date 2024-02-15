package homework.day5.task1.playground.essense;

public interface Flyable {
    default void fly(String direction) {
        String sout = "I am " + this.getClass().getSimpleName() + ", my name is " + getClass().getName() + "and I amd flying to " + direction;
        System.out.println();
    }

}
