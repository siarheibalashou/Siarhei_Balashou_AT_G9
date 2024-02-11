package homework.day2;

public class RunnerClass {
    public static void main(String[] args) {
        ArraysPlusConsole arraysPlusConsole = new ArraysPlusConsole();
        int[] array = {3,7,5,6,6,8,12,7,8,10};
        arraysPlusConsole.sumPlusNElement(array, 5);
        arraysPlusConsole.elementGreaterThan(array,9);
    }
}
