package homework.day1.basetask.pretask;

import java.util.Random;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int variable = new Random().nextInt(50);
        Math.abs(variable);
        variable++;
        variable -= 5;
        System.out.println(variable);

    }
}
