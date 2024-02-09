package pretask;

public class ConditionalLoopExample {
    public static void main(String[] args) {
        for (int evenNumber = 1; evenNumber <= 10; evenNumber++) {
            if (evenNumber % 2 == 0) {
                System.out.print(" " + evenNumber);
            }
        }
    }
}
