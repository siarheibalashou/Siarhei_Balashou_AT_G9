package BubbleTask;

public class Bubble {
    private final double bubbleVolume = 0.3;
    private String bubbleStructure;

    public Bubble(String structure) {
        this.bubbleStructure = structure;
    }

    public double getVolume() {
        return bubbleVolume;
    }

    public String getStructure() {
        return bubbleStructure;

    }

    public void setBubbleStructure(String bubbleStructure) {
        this.bubbleStructure = bubbleStructure;
    }

    public void cramp() {
        System.out.print("Cramp!");
    }

}

