package project.bubbletask.watertype;

public class SparklingWater extends Water {
    private boolean isOpened;
    Bubble bubble = new Bubble("c2");
    Bubble[] bubbles;


    public SparklingWater(String color, String transparency, int temperature, String smell) {
        super(color, transparency, temperature, smell);
        isOpened();
    }

    public boolean isOpened() {
        return isOpened;

    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < bubbles.length; i++) {
            bubbles[i] = new Bubble("c3");
        }
    }

    public void setOpened() {
        if (!isOpened()) {
            isOpened = true;
            degas();
        } else System.out.println("Бутылка уже открыта");
    }

    public void degas() {
        for (int i = 0; i < bubbles.length; i++) {
            System.out.print(i + " ");
            bubble.cramp();
            bubbles[i] = null;
        }
    }

    private void degas1() throws InterruptedException {
        for (int i = 0; i < bubbles.length; i++) {
            if (i == (10 + 5 * getTemperature())) {
                Thread.sleep(1000);
            }
        }
    }

    private void isOpened1() {
    }
}
