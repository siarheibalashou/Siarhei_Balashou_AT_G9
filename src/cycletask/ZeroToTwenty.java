package cycletask;

public class ZeroToTwenty {
    private int value = 1;
    public void oneToTwenty() {
        while (value <= 20) {
            System.out.print(value + " ");
            value++;
        }
        System.out.println();
    }
}
