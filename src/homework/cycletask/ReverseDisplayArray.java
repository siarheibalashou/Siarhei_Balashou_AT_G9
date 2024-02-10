package homework.cycletask;

import java.util.Arrays;

public class ReverseDisplayArray {
    private int[] array = {1, 2, 3, 4, 5};
    private int[] tempArray = new int[5];

    public void reverseArray() {
        int i1 = 0;
        for (int i = array.length - 1; i > -1; i--) {
            tempArray[i1] = array[i];
            i1++;
        }
        System.out.println("Reversed array: " + Arrays.toString(tempArray));
    }
}


