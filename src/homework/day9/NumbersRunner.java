package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

//8.
//Создать поток данных целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Stream.of())
//В потоке данных проитерировать числа и отпечатать числа в консоль новой строки
//Отсортировать и снова отпечатать в консоль с новой строки
//Посчитать сумму всех чисел и вывести результат в консоль

public class NumbersRunner {
    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        System.out.println(numbers.peek(System.out::println)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println).mapToInt(Integer::valueOf).sum());
    }
}
