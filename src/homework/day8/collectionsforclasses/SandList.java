package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Sand;
import homework.day8.util.UtilClassForMap;

import java.util.*;

public class SandList {
    public static Random random = new Random();

    public static void main(String[] args) {
        UtilClassForMap utilClassForMap = new UtilClassForMap();
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));
        printSandWeight(sandbox);
        printSandName(sandbox);
        Map<Integer, Sand> sandMap = new HashMap<>();
        utilClassForMap.fillMapWithObjects(sandbox, sandMap);
        utilClassForMap.printMapKey(sandMap);
        utilClassForMap.printMapValue(sandMap);
        utilClassForMap.printKeyMapPair(sandMap);

    }

    public static void printSandName(List<Sand> anySandList) {
        for (Sand sand : anySandList) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();
    }

    public static void printSandWeight(List<Sand> anySandList) {
        for (Sand sand : anySandList) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();
    }
}
