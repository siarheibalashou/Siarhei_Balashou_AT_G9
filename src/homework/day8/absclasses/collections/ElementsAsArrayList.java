package homework.day8.absclasses.collections;

import java.util.ArrayList;
import java.util.List;

//7.
//Создать пустой список стрингов elements (через new ArrayList)
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

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

        elements.add(3, "Spinner");
        elements.remove(1);
        elements.set(4, "Switch");
        System.out.println();

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
