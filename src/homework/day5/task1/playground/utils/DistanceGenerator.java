package homework.day5.task1.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDisctance() {
        Random random = new Random();
        int randomValue = random.nextInt(1, 100);
        System.out.printf("DistanceGenerator: I have generated distance with value: %s", randomValue).println();
        return randomValue;
    }
}
