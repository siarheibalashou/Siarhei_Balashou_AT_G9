package homework.pretask;

import java.util.Random;

public class SimpleLoopExample {
    public static void main(String[] args) {
        int intNumber = new Random().nextInt(11);
        for (int i=1; i<=intNumber; i++){
            System.out.print(" "+i);
        }
    }
}
