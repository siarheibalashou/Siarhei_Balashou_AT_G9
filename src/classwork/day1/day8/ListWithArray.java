package classwork.day1.day8;

import java.util.ArrayList;
import java.util.List;

public class ListWithArray {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String[] arrayWithElements = ("мама мыла раму").split("\\s");
        for (String arrayElement : arrayWithElements) {
            myList.add(arrayElement);

        }
        System.out.println(myList);
        for (String arrayElement : myList) {
            System.out.println(arrayElement);
        }
        for (int arrayElement = 0; arrayElement < myList.size(); arrayElement++) {
            System.out.println(myList.get(arrayElement));
        }
    }
}
