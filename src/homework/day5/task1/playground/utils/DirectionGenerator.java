package homework.day5.task1.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    private static String directionValue;

    public static String generateDirection() {
        Random random = new Random();

        int randomNumber = random.nextInt(1, 40);
        if (randomNumber >= 1 & randomNumber <= 9) {
            directionValue = "NORTH";
        } else if (randomNumber >= 10 & randomNumber <= 19) {
            directionValue = "SOUTH";
        } else if (randomNumber >= 20 & randomNumber <= 29) {
            directionValue = "WEST";
        } else if (randomNumber >= 30 & randomNumber <= 39) {
            directionValue = "EAST";
        }
        return directionValue;
    }
}
