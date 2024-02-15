package homework.day5.task1.playground.essense.creatures;

public class Beetle extends Insect implements Crawlable {

    public void nest(Carrot home) {
        String N = getName();
        int D;
        if (getMass() < home.getMass()) {
            D = (int) home.getMass() / getMass();
            System.out.println("I am " + N + " and I will nest there with " + D + " my family members!");
        } else System.out.println("This carrot is too small for nesting :(");
    }
}
