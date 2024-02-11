package homework.day2;

import java.util.Arrays;

public class ArraysPlusConsole {
    public void sumPlusNElement(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % n == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма каждого " + n + "-го элемента = " + sum);

    }

    public void elementGreaterThan(int[] array, int n) {
        int[] tempArray = new int[12];
        int reversedArrayElementIndex = 0;
        int reversedArray[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                for (int i1 = 0; i1 < tempArray.length; i1++) {
                    if (tempArray[i1] == 0) {
                        tempArray[i1] = array[i];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tempArray));
        for (int i = tempArray.length - 1; i > -1; i--) {
            reversedArray[reversedArrayElementIndex] = tempArray[i];
            reversedArrayElementIndex++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}

