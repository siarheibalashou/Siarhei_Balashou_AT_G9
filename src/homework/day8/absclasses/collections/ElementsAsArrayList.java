package homework.day8.absclasses.collections;

import java.util.ArrayList;
import java.util.List;

public class ElementsAsArrayList {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        int counter = 0;
        for (String element : elements) {
            if (element.contains("\s") || element.contains("-")) {
                counter++;
            }

        }
        System.out.println();
        System.out.println("кол-во элементов из больше двух слов: " + counter);

        for (int index = 0; index < elements.size(); index++) {
            System.out.print(elements.get(index) + " ");
        }
        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");
        System.out.println();
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
