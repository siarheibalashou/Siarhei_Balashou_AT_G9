package homework.day8.absclasses.collections;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//2.
//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в файл figures через тире
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Вставить на 3 позицию Треугольник
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

public class FiguresAsList {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file_with_figures"));

            for (String figure : figures) {
                writer.write(figure + "-");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println("IOException - write operation can be failed ");
        }
        int counter = 0;

        for (String figure : figures) {
            if (!figure.contains("и"))
                counter++;
        }

        System.out.println("Кол-во слов без \"и\": " + counter);

        for (int elemIndex = 0; elemIndex < figures.size(); elemIndex++) {
            System.out.printf(" %s", figures.get(elemIndex));
        }

        System.out.println();
        figures.set(2, "Треугольник");

        for (String figure : figures) {
            System.out.print(" " + figure);
        }
    }
}
