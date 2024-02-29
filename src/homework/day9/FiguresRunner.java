package homework.day9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//2.
//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Stream.of())
//Заменить каждое слово на целое число, соответствующее количеству буков в слове
//Отфильтровать числа, которые больше 4
//Отпечатать все оставшиеся числа в консоль

public class FiguresRunner {
    public static void main(String[] args) {
        List<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс").toList();
        figures.stream().map(String::length).filter(integer -> integer > 4).forEach(System.out::println);
    }

}
