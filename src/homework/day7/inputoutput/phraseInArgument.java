package homework.day7.inputoutput;

import java.util.Scanner;

public class phraseInArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannedString = String.valueOf(scanner.next());
        System.out.printf("Hello, I just got %s from you!",scannedString);
    }
}
