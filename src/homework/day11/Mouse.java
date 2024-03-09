package homework.day11;

public class Mouse {
    private final String PATTERN = "Mouse ";
    private String name;

    public Mouse(int number) {
        this.name = PATTERN + number;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getCause());
        }
    }

    public void peep() {
        System.out.println(this.name + " PEEP!");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "PATTERN='" + PATTERN + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
