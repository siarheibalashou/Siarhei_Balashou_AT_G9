package homework.day8.absclasses.collections;

//4.
//Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через new ArrayList)
//Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
//Найти и удалить из набора авто, в названии которых больше 4 букв
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarsAsArrayList {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Жигуль");
        cars.add("Ауди");
        cars.add("Мерс");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file_with_cars", true));
            for (String car : cars) {
                String formattedCar = String.format("\"%s\"\n", car);
                writer.write(formattedCar);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("IOException - displayed when error on file writing happened");
        }
        System.out.println(cars);
//        for (int elemIndex = 0; elemIndex < cars.size(); elemIndex++) {
//            if (cars.get(elemIndex).length() > 4) {
//                cars.remove(elemIndex);
//            }
//        }
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() > 4)
                iterator.remove();
        }
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
