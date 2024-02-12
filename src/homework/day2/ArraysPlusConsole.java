package homework.day2;

import java.util.Arrays;
import java.util.Calendar;

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

    public int[] elementGreaterThan(int[] array, int n) {
        int reversedArrayElementIndex = 0;
        int[] tempArray = new int[11];
        int[] reversedArray = new int[11];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                for(int i1=0; i1 < tempArray.length; i1++)
                    if(tempArray[i1] == 0) {
                        tempArray[i1] = array[i];
                        break;
                    }
            }
        }
        for (int i = array.length; i > -1; i--) {
            reversedArray[reversedArrayElementIndex] = tempArray[i];
            reversedArrayElementIndex++;
        }
        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }

    public int elementsDividedToDay(int[] array) {
        int sum = 0;
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % dayOfMonth == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public void cowOrHow (){
        System.out.println(" ^__^");
        System.out.println("\t  (oo)\\\\_______");
        System.out.println("\t (__)\\ ) \\/\\  \\");
        System.out.println("\t      ||----w |\\");
        System.out.println("\t      ||     ||");
    }
}

