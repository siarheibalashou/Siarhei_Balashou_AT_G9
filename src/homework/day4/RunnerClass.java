package homework.day4;

public class RunnerClass {
    public static void main(String[] args) {
        ArraysPlusConsole arraysPlusConsole = new ArraysPlusConsole();
        int[] array = {3, 7, 5, 6, 11, 8, 12, 22, 8, 10};
        arraysPlusConsole.sumPlusNElement(array, 5); //finished
        arraysPlusConsole.elementGreaterThan(array, 9); //returns fixed array size - need consists only of selected elements
        arraysPlusConsole.elementsDividedToDay(array);//finished
        arraysPlusConsole.cowOrHow(); //finished
    }
}
