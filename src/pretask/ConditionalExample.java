package pretask;

import java.util.Random;

public class ConditionalExample {
    public static void main(String[] args) {
        int intNumber = new Random(11).nextInt(25);
        if (intNumber > 10) {
            System.out.println("Higher than 10");
        } else System.out.println("Lower than 10");
    }
}
