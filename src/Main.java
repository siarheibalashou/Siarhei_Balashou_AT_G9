
import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.print("initial array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        System.out.println("Average value is: " + avg/ array.length);
    }
}