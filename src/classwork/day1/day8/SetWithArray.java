package classwork.day1.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetWithArray {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String[] splittedString = "мама мыла раму мыла раму".split(" ");
        for (String i : splittedString) {
            mySet.add(i);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("~~~~~~~~~~~~~");
        for (String i : mySet) {
            System.out.println(i);
        }
    }
}

