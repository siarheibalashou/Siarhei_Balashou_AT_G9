package homework.day6.generics;

import homework.day5.task1.playground.essense.Matter;
import homework.day5.task1.playground.essense.craft.air.Aircraft;
import homework.day5.task1.playground.essense.craft.air.Copter;
import homework.day5.task1.playground.essense.craft.air.Plane;
import homework.day5.task1.playground.essense.craft.air.Rocket;
import homework.day5.task1.playground.essense.craft.field.Car;
import homework.day5.task1.playground.essense.craft.field.Moped;
import homework.day5.task1.playground.essense.craft.field.Motorbike;
import homework.day5.task1.playground.essense.craft.field.Vehicle;
import homework.day5.task1.playground.essense.craft.hand.Bottle;
import homework.day5.task1.playground.essense.craft.hand.Can;
import homework.day5.task1.playground.essense.craft.hand.Container;
import homework.day5.task1.playground.essense.craft.hand.Mug;
import homework.day5.task1.playground.essense.material.Diesel;
import homework.day5.task1.playground.essense.material.Petrol;
import homework.day5.task1.playground.essense.material.Water;


public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT genericMethodsInGenericClassT = new GenericMethodsInGenericClassT();
        Bottle type = new Bottle(12,"asss");
        genericMethodsInGenericClassT.genericMethodOneGenArg(type);
        genericMethodsInGenericClassT.genericMethodTwoGenArgs(type, new Car(12, "asd"));
        genericMethodsInGenericClassT.genericMethodHalfGenArgs(type, "asdasd!@#%^");
        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassTString = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassTInteger = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassTDouble = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassTCar = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassTCopter = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassTPlane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassTRocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassTMoped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassTMotorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> genericMethodsInGenericClassTVehicle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Aircraft> aircraftGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> containerGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> matterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT.genericMethodHalfGenArgs(genericMethodsInGenericClassTMotorbike, "1231");
        genericMethodsInGenericClassT.genericMethodOneGenArg(genericMethodsInGenericClassTVehicle);
        System.out.println(genericMethodsInGenericClassT.genericMethodTwoGenArgs(genericMethodsInGenericClassTMotorbike,"123123"));
        System.out.println(genericMethodsInGenericClassTCar.genericMethodTwoGenArgs(new Car(123,"123"),new Plane(15555,"Strttttt")));
        genericMethodsInGenericClassTCar.genericMethodOneGenArg(new Car(55,"new car"));

    }
}
