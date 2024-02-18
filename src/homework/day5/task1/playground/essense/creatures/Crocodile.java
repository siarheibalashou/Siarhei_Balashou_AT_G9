package homework.day5.task1.playground.essense.creatures;

public class Crocodile extends Vertebrata  implements Crawlable{
    protected int mass;

    public Crocodile(int mass, String name) {
        super(mass, name);
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
    public void crawl(String direction, int distance) {
        System.out.format("I am %s, my name is %s and I am crawling to %s for %s units", this.getClass().getSimpleName(), this.name, direction, distance).println();
        System.out.println("wr-wr-wrr-r..");
    }
}
