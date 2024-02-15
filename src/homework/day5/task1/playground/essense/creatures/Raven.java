package homework.day5.task1.playground.essense.creatures;

public class Raven extends Vertebrata{
    protected int mass;

    public Raven(int mass) {
        this.mass = mass;
    }

    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public void setMass(int mass) {
        this.mass = mass;
    }

    public void eat(Insect food) {
        String foodName = food.toString();
        System.out.println("I am " + getName() + " I am eating " + foodName);

    }
}
