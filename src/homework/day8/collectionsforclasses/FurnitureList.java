package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Chair;
import homework.day8.util.UtilClassForMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureList {
    public static void main(String[] args) {
        UtilClassForMap utilClassForMap = new UtilClassForMap();
        List<Chair> furniture = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
        multiplyCalculation(furniture);
        Map<Integer, Chair> furnitureMap = new HashMap<>();
        utilClassForMap.fillMapWithObjects(furniture, furnitureMap);
        utilClassForMap.printMapKey(furnitureMap);
        utilClassForMap.printMapValue(furnitureMap);
        utilClassForMap.printKeyMapPair(furnitureMap);
    }

    public static void multiplyCalculation(List<Chair> anyFurnitureList) {

        for (Chair anyChair : anyFurnitureList) {
            int heightXWidth = anyChair.getWidth() * anyChair.getHeight();
            System.out.printf("Произведение высоты на ширину %s = %s ", anyChair.getClass().getSimpleName(), heightXWidth).println();
        }
    }
}
