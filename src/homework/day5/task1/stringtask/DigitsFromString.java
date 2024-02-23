package homework.day5.task1.stringtask;

import java.util.Arrays;

//сделать метод, который позволяет найти в тексте все цифры и преобразовать их в массив числовых переменных,
// вывести все элементы массива в косоль, текст получает на вход в виде аргумента

public class DigitsFromString {
    public void digitsToArray(String unparsedString) {
        String parsedStr = unparsedString.replaceAll("[^1234567890]", "");
        String[] strArrayWithSpaces = parsedStr.replace("", " ").trim().split("\\s");
        int[] array = new int[parsedStr.length()];
        for (int i = 0; i < parsedStr.length(); i++) {
            array[i] = Integer.parseInt(strArrayWithSpaces[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
