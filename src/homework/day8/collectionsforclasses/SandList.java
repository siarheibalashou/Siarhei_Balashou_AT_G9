package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Sand;

import java.util.*;

public class SandList {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));
        printSandWeight(sandbox);
        printSandName(sandbox);
        Map<Integer, Sand> sandMap = new HashMap<>();
        fillMapWithObjects(sandbox, sandMap);
        printMapKey(sandMap);
        printMapValue(sandMap);
        printKeyMapPair(sandMap);

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

    public static Map<Integer, Sand> fillMapWithObjects(List<Sand> sandList, Map<Integer, Sand> sandMap) {
        for (Sand sand : sandList) {
            sandMap.put(random.nextInt(1, 10000), sand);
        }
        System.out.println();
        return sandMap;
    }

    public static void printMapKey(Map<Integer, Sand> anySandMap) {
        for (int key : anySandMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public static void printMapValue(Map<Integer, Sand> anySandMap) {
        for (Sand value : anySandMap.values()) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public static void printKeyMapPair(Map<Integer, Sand> anySandMap) {
        for (Map.Entry<Integer, Sand> sand : anySandMap.entrySet()) {
            System.out.println(sand);
        }
        System.out.println();
    }

}
