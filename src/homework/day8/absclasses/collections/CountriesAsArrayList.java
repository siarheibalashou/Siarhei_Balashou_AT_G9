package homework.day8.absclasses.collections;

//5.
//Создать пустой список стрингов countries (через new ArrayList)
//Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
//Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
//Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль с новой строки

import java.util.ArrayList;
import java.util.List;

public class CountriesAsArrayList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");
        for (String country : countries) {
            System.out.printf("%s, ", country);
        }
        System.out.println();
        int counter = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                counter++;
            }
        }
        System.out.println("Кол-во стран с меньше 7 букв в названии: " + counter);

        for (int index = 0; index < countries.size(); index++) {
            System.out.println(countries.get(index));
        }
    }
}
