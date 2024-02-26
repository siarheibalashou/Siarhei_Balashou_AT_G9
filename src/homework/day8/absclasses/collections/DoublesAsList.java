package homework.day8.absclasses.collections;

import java.util.Arrays;
import java.util.List;

public class DoublesAsList {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        for (double doubleFromList : doubles) {
            System.out.print(doubleFromList + " ");
        }
        System.out.println();
        int multiplyCounter = 1;

        for (double doubleFromList : doubles) {
            multiplyCounter *= doubleFromList;
        }
        System.out.println("Произведение всех элементов: " + multiplyCounter);

        decimalSum(doubles);
        integerNumberPart(doubles);
    }

    private static void decimalSum(List<Double> listWithDecimals) {
        int decimalSumofList = 0;
        for (double doubleFromList : listWithDecimals) {
            String decimalValueStr = String.valueOf(doubleFromList).replaceAll("^\\d*\\.", "");
            int decimalValueInt = Integer.parseInt(decimalValueStr);
            decimalSumofList += decimalValueInt;
        }
        System.out.println("Сумма всех дробных частей: " + decimalSumofList);
    }

    private static void integerNumberPart(List<Double> listWithDecimals) {
        String intPartOfDouble = "";
        System.out.print("Целые части элементов листа: ");
        for (int elementIndex = 0; elementIndex < listWithDecimals.size(); elementIndex++) {
            intPartOfDouble = String.valueOf(listWithDecimals.get(elementIndex)).replaceFirst("\\.\\d*", "");
            System.out.print(Integer.parseInt(intPartOfDouble) + " ");
        }
        System.out.println();
    }
}
