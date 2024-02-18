package homework.day5.task1.playground.utils;

import homework.day5.task1.playground.essense.material.Diesel;
import homework.day5.task1.playground.essense.material.Petrol;
import homework.day5.task1.playground.essense.material.Pourable;

import java.util.Random;

public class VolumeGenerator {
    private static int randomNumber =0;
    public static int generateVolume(Pourable pourable) {
        Random random = new Random();
        switch (pourable.getClass().getSimpleName()) {
            case "Diesel", "Petrol":
                randomNumber = random.nextInt(1, 50);
                break;
            case "Water":
                randomNumber = random.nextInt(50, 100);
                break;
        }
        System.out.printf("VolumeGenerator: I have generated volume of %s with value: %d", pourable.getClass().getSimpleName(), randomNumber).println();
        return randomNumber;
    }

}
