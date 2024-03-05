package homework.day9;


//11.
//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())
//В потоке данных отфельтровать только те пузыри, обьем которых больше 3
//Отсортировать данные по имени в восходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет обьем в 3 раза больше исходного
//Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль

import homework.day8.absclasses.Bubble;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"));

        System.out.println(bubbles.stream()
                .filter(bubble -> bubble.getVolume() > 3)
                .sorted(Comparator.comparing(Bubble::getVolume))
                .map(bubble -> new Bubble(bubble.getVolume() * 3, bubble.getName()))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume).sum());
    }
}
