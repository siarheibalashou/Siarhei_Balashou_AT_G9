package project.bubbletask.boxing.interfaces;

public interface Containable {
    void addStuff(Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();

}
