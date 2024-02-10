package homework.day1.basetask.cycletask;

import java.util.Arrays;

public class ReverseDisplayArray {
    private int[] array = {1, 2, 3, 4, 5};
    private int[] tempArray = new int[5];

    public int[] reverseArray() {
        int i1 = 0;
        for (int i = array.length - 1; i > -1; i--) {
            tempArray[i1] = array[i];
            i1++;
        }
        System.out.print("reversed array is: ");
        for (int y:tempArray){
            System.out.print(y +" ");
        }
        return tempArray;
    }
}


