package homework.day5.task1.playground.processors;

import homework.day5.task1.playground.essense.craft.Transportable;
import homework.day5.task1.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int transportableMove = Math.abs(transportable.move(pointA, pointB));
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + transportableMove + "points");
    }

    public void runTransportable(Transportable transportable) {
        int transportableMove = Math.abs(transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate()));
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + " was moved to " + transportableMove + "points");

    }
}
