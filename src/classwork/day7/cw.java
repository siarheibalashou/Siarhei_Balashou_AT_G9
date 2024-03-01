package classwork.day7;

import java.util.Scanner;

public class cw {
    private static int main = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equalsIgnoreCase("stop")) {
                System.out.println("pokapoka");
                break;
            }
            System.out.printf("Just got '%s' text", incoming).println();
        }
    }
}
