package homework.day11;

public class Mouse {
    private final String PATTERN = "Mouse ";
    private String name;

    public Mouse(int number) {
        this.name = PATTERN + number;
    }

    public void peep() {
        System.out.println(this.name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getCause());
        }
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "PATTERN='" + PATTERN + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
