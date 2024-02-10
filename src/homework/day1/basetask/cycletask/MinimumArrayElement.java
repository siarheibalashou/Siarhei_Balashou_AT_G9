package homework.day1.basetask.cycletask;

public class MinimumArrayElement {
    int[] array = {5, 12, 10, 1, 0};
    int minElement = array[0];

    public void minimumArrayElem() {
        for (int i = 0; i < array.length; i++) {
            if (array[i]<minElement) {
                minElement = array[i];
            }
        }
        System.out.println("Miminum element in array: " + minElement);
        System.out.println();
    }
}
