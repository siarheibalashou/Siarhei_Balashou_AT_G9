package classwork.day8;

import java.util.HashMap;
import java.util.Map;

public class MapWithString {
    public static void main(String[] args) {
        Map<Integer, String> words = new HashMap<>();
        String[] arrayWithElements = ("мама мыла раму мыла").split("\\s");
        for (int i = 0; i < arrayWithElements.length; i++) {
            words.put(i, arrayWithElements[i]);
        }
        System.out.println(words);
        for (int i : words.keySet()) {
            System.out.println(i);
        }

        for (String i : words.values()) {
            System.out.println(i);
        }
        for (Map.Entry<Integer, String> i : words.entrySet()) {
            System.out.println(i);
        }
    }
}
