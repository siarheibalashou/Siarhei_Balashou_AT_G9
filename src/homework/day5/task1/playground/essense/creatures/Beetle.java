package homework.day5.task1.playground.essense.creatures;

import static java.lang.Math.round;

public class Beetle extends Insect implements Crawlable {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        String N = getName();
        int D;
        if (getMass() < home.getMass()) {
            D = round(home.getMass() / getMass());
            System.out.println("I am " + N + " and I will nest there with " + D + " my family members!");
        } else System.out.println("This carrot is too small for nesting :(");
    }

    @Override
    public void crawl(String direction, int distance) {
        System.out.format("I am %s, my name is %s and I am crawling to %s for %s units", this.getClass().getSimpleName(), this.name, direction, distance).println();
        System.out.println("vz-vz-vzz-zz..");
    }
}
