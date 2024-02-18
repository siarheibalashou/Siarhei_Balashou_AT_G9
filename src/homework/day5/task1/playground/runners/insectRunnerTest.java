package homework.day5.task1.playground.runners;

import homework.day5.task1.playground.essense.creatures.Beetle;
import homework.day5.task1.playground.essense.creatures.Crocodile;
import homework.day5.task1.playground.essense.creatures.Insect;

public class insectRunnerTest {
    public static void main(String[] args) {
        Beetle insectBeetle = new Beetle(1555,"zhuk8");
        Crocodile insectCrocodile = new Crocodile(123123123,"crocodile12");
        insectCrocodile.crawl("pravo",12);
        insectBeetle.crawl("levo",123344);
    }
}
