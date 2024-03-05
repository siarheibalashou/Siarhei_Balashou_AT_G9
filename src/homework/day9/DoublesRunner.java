package homework.day9;

import homework.day8.absclasses.Bubble;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

//10.
//Создать поток данных дробных чисел doubles из 8 чисел (33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9) через (Stream.of())
//Округлить каждое число до целого
//На основании этого потока сгенерировать новый поток данных целых чисел из случайных чисел с границами от 0 до числа из иходного потока данных
//Убрать дубликаты значений
//Заменить каждое число в получившемся потоке данных новым потоком состоящим из обьектов Bubble в количестве равному заменяемому числу,
//создавая обьекты с обьемом равным числу из исходного потока и именем по маске "Bubble vol-" + i, где i - число из исходного потока
//Отпечатать в консоль каждый из обьектов нового потока с новой строки
//Найти общий обьем полученного потока пузырьков и отпечатать в консоль

public class DoublesRunner {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);
        System.out.println(doubles.map(d -> (int) Math.round(d))
                .flatMapToInt(integer -> {
                    int[] intArray = new int[integer];
                    for (int i = 0; i < integer; i++) {
                        intArray[i] = random.nextInt(0, integer);
                    }
                    return Arrays.stream(intArray);
                }).boxed()
                .distinct()
                .flatMap(s -> {
                    Bubble[] bubbles = new Bubble[s];
                    for (int i = 0; i < bubbles.length; i++) {
                        bubbles[i] = new Bubble(s, "Bubble vol-" + s);
                    }
                    return Stream.of(bubbles);
                })
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}
