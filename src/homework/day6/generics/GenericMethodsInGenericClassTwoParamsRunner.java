package homework.day6.generics;

import homework.day1.basetask.Bee;
import homework.day5.task1.playground.essense.craft.air.Aircraft;
import homework.day5.task1.playground.essense.craft.air.Copter;
import homework.day5.task1.playground.essense.craft.air.Plane;
import homework.day5.task1.playground.essense.craft.field.Motorbike;
import homework.day5.task1.playground.essense.craft.field.Vehicle;
import homework.day5.task1.playground.essense.creatures.Fly;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> genericMethodsInGenericClassTwoParamsStrStr = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> genericMethodsInGenericClassTwoParamsStrInteger = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> genericMethodsInGenericClassTwoParamsStrDouble = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Fly, Motorbike> genericMethodsInGenericClassTwoParamsFlyMotorbike = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Aircraft, Vehicle> genericMethodsInGenericClassTwoParamsAircraftVehicle = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(genericMethodsInGenericClassTwoParamsAircraftVehicle.genericMethodGenArgs(new Copter(12444,"flylylyly")));
        genericMethodsInGenericClassTwoParamsFlyMotorbike.genericMethodHalfGenArgs(new Fly(123123,"123123"),new Motorbike(1231233213,"Motomoto"),"string of items");
    }
}
