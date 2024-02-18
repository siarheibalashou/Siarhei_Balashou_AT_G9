package homework.day5.task1.playground.essense.material;

public class Water implements Pourable {
    protected int mass;

    public Water(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void spread(String storeName) {
        System.out.printf("I am %s and I am spreading in %s", this.getClass().getSimpleName(), storeName).println();
        System.out.println("whobl-whobl..");
    }
}
