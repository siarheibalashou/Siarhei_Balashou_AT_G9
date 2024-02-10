package homework.day1.basetask.cycletask;

public class PrintArrayElements {
    int[] array = {1, 5, 8, 7, 9};

    public void displayArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
