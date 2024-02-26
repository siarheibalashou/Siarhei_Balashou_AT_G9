package homework.day8.absclasses.collections;

//8.
//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
//Отсортировать список по возрастанию
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
//Развернуть список в обратном порядке
//Проитерировать список через for-each и отпечатать числа в консоль через пробел

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NumbersAsList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);
        int sum = 0;

        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.println("сумма айтемов коллекции: " + sum);
        numbers.sort(Comparator.naturalOrder());

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Развернутый в обратном порядке: ");

        for (Integer number : numbers) {
            System.out.printf("%s ", number);
        }
    }
}
