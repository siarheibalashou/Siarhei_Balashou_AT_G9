package homework.day1.basetask.pretask;

import java.util.Random;

public class MathOperatorsExample {
    public static void main(String[] args) {
        int intNumberOne = new Random().nextInt(10);
        int intNumberTwo = new Random().nextInt(10);
        Math.abs(intNumberTwo);
        Math.abs(intNumberTwo);
        System.out.println("Sum of two values = " + (intNumberOne + intNumberTwo));
        System.out.println("Subtraction of two values = " + (intNumberOne - intNumberTwo));
        System.out.println("Multiplication of two values = " + (intNumberOne * intNumberTwo));
        System.out.println("Division of two values = " + (intNumberOne / intNumberTwo));
    }
}