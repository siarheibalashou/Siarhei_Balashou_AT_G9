package homework.day8.util;

import java.util.List;
import java.util.Map;

import static homework.day8.collectionsforclasses.SandList.random;

public class UtilClassForMap<T> {

    public Map<Integer, T> fillMapWithObjects(List<T> anyList, Map<Integer, T> anyMap) {
        for (int i = 0; i < anyList.size(); i++) {
            anyMap.put(i, anyList.get(i));
        }
        System.out.println();
        return anyMap;
    }

    public void printMapKey(Map<Integer, T> anyMap) {
        for (int key : anyMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public void printMapValue(Map<Integer, T> anyMap) {
        for (T value : anyMap.values()) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    public void printKeyMapPair(Map<Integer, T> anyMap) {
        for (Map.Entry<Integer, T> anyEntrySet : anyMap.entrySet()) {
            System.out.println(anyEntrySet);
        }
        System.out.println();
    }
}
