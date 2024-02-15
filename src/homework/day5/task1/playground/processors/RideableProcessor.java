package homework.day5.task1.playground.processors;

import homework.day5.task1.playground.essense.craft.Rideable;
import homework.day5.task1.playground.utils.DirectionGenerator;

public class RideableProcessor {
    public void runRideable(Rideable rideable) {
        rideable.drive(DirectionGenerator.generateDirection());
    }

    public void runRideable(Rideable rideable, String direction) {
        rideable.drive(direction);
    }
}
