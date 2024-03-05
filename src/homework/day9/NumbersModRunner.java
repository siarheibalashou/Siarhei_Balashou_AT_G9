package homework.day9;

import java.util.Comparator;
import java.util.stream.Stream;

//9.
//Создать поток данных целых чисел numbersMod из 8 чисел (626, 435, 9, 1463268, 24, 2237, 33, 9090) через (Stream.of())
//Отфильтровать те числа, которые содержать цифру 3
//Разбить числа на отдельные цифры и заменить цифры соответствующими словами
//Оставить только уникальные слова, отсортировать в нисходящем порядке и отпечатать в консоль с новой строки

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.filter(i -> i.toString().contains("3")).flatMapToInt(i -> String.valueOf(i).chars()).mapToObj(c -> (char) c).
                map(c -> switch (c) {
                    case '0' -> "ноль";
                    case '1' -> "один";
                    case '2' -> "два";
                    case '3' -> "три";
                    case '4' -> "четыре";
                    case '5' -> "пять";
                    case '6' -> "шесть";
                    case '7' -> "семь";
                    case '8' -> "восемь";
                    case '9' -> "девять";
                    default -> "null";
                }).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
