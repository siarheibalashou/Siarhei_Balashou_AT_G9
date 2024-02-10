package homework.day1.basetask.cycletask;

import java.util.Arrays;

public class FirstElementToLast {
    public void firstToLast() {
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
                for (int i1:tempArray){
                    System.out.println("First element switched with last-" + tempArray[i1]);
                }
            }
        }
        System.out.println();

    }
}
