package cycletask;

import java.util.Random;

public  class ArrayElementsSquaring {
    Random random = new Random();
    int[] array = new int[8];
    public void arraySquaring() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            array[i]*=array[i];
        }
        System.out.println("Random array squaring: ");
        for (int y : array) {
            System.out.print(y + " ");
        }
        System.out.println();
    }
}
