package homework.day5.task1.playground.essense;

public abstract class Matter {
   protected int mass;

    public Matter(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }
}
