package CycleTask;

import java.util.Random;

public class ArrayElementMultiplication {
    Random random = new Random();
    int[] array = new int[8];

    public void arrayMultiplication() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            array[i] *= 5;
        }
        System.out.println("Random array multiplied: ");
        for (int y : array) {
            System.out.print(y + " ");
        }System.out.println();
    }
}
