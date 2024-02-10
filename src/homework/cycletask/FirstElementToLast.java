package homework.cycletask;

import java.util.Arrays;

public class FirstElementToLast {
    public int[] firstToLast() {
        int[] array = {12, 3, 18, 4};
        int[] tempArray = array; //tempArray[y] = 12; tempArray[0]=4
        int firstElement = array[0]; //12
        int lastElement = 0; //12
        int x;//4
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                lastElement = array[i];
                break;
            }
        }
        x = lastElement;
        lastElement = firstElement;
        for (int y = 0; y < tempArray.length; y++) {
            if (y == tempArray.length - 1) {
                tempArray[y] = lastElement;
                tempArray[0] = x;
            }
        }
        System.out.println("First element switched with last-" + Arrays.toString(tempArray));
        System.out.println();
        return tempArray;

    }
}
