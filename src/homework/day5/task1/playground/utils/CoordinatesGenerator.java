package homework.day5.task1.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate(){
        Random random = new Random();
        int generatedNumber = random.nextInt(1,80);
        System.out.println("CoordinatesGenerator: I have generated point with value: " +generatedNumber);
        return generatedNumber;
    }
}
