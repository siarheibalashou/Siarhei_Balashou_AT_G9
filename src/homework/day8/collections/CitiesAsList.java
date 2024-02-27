package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

//3.
//Создать пустой список стрингов cities (через new ArrayList)
//Добавить в список 3 города (Минск, Москва, Берлин)
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки
//Посчитать сумму всех буков во всех словах и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел

public class CitiesAsList {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");
        System.out.println("Города с новой строки: ");

        for (String city : cities) {
            System.out.println(city);
        }

        int counter = 0;

        for (int listElem = 0; listElem < cities.size(); listElem++) {
            counter += cities.get(listElem).length();
        }

        System.out.println("Кол-во буков: " + counter);
        System.out.print("Города в строку по индексу:");

        for (int listElem = 0; listElem < cities.size(); listElem++) {
            System.out.printf(" %s", cities.get(listElem));
        }
    }
}
