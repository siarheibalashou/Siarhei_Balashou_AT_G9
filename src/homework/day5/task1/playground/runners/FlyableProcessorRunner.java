package homework.day5.task1.playground.runners;

import homework.day5.task1.playground.essense.Flyable;
import homework.day5.task1.playground.essense.craft.air.Aircraft;
import homework.day5.task1.playground.essense.craft.air.Copter;
import homework.day5.task1.playground.essense.craft.air.Plane;
import homework.day5.task1.playground.essense.craft.air.Rocket;
import homework.day5.task1.playground.essense.creatures.Fly;
import homework.day5.task1.playground.essense.creatures.Insect;
import homework.day5.task1.playground.essense.creatures.Mosquito;
import homework.day5.task1.playground.processors.FlyableProcessor;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();
        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        Aircraft aircraftCopter = new Copter(223, "Mi8 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
    Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");
////    flyableProcessor.runFlyable(flyableCopter);
////    flyableProcessor.runFlyable(flyablePlane);
//    flyableProcessor.runFlyable(flyableRocket);
//    flyableProcessor.runFlyable(flyableFly);
    flyableProcessor.runFlyable(flyableMosquito);
////    flyableProcessor.runFlyable(aircraftCopter);
////    flyableProcessor.runFlyable(aircraftPlane);
////    flyableProcessor.runFlyable(aircraftRocket);
     /*   flyableProcessor.runFlyable(insectFly); не использует методы интерфейса Flyable
        flyableProcessor.runFlyable(insectMosquito);*/

//   flyableProcessor.runFlyable(aCopter);
//   flyableProcessor.runFlyable(aPlane);
//   flyableProcessor.runFlyable(aRocket);
//   flyableProcessor.runFlyable(aFly);
        flyableProcessor.runFlyable(aMosquito);
//   flyableProcessor.runFlyable(aCopter, "никуда");
//   flyableProcessor.runFlyable(flyableFly, "повсюду");
    }
}
