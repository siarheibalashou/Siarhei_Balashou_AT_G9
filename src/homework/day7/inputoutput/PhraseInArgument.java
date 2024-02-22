package homework.day7.inputoutput;

import java.util.Scanner;

//выводит в консоль фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль с клавиатуры.

public class PhraseInArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannedString = String.valueOf(scanner.next());
        System.out.printf("Hello, I just got %s from you!", scannedString);
    }
}
