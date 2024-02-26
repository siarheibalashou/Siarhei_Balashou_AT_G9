package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Bubble;

import java.util.Arrays;
import java.util.List;

//11.
//Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами (CO2, O2, CO)
//соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать объемы в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Посчитать объем всех пузырей и вывести число в консоль
//Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

public class BubblesList {


    public static void main(String[] args) {

        List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));
        volumesOfBubblesSout(bubbles);
        namesOfBubblesSout(bubbles);
        System.out.println("Общий обьем пузырей: " + volumeCalculation(bubbles));
        for (int index = 0; index < bubbles.size(); index++) {
            System.out.printf((bubbles.get(index).toString()) + "%n");
        }

    }

    public static void volumesOfBubblesSout(List<Bubble> anyBubbles) {
        for (Bubble bubble : anyBubbles) {
            System.out.print(bubble.getVolume() + " ");
        }
        System.out.println();
    }

    public static void namesOfBubblesSout(List<Bubble> anyBubbles) {
        for (Bubble bubble : anyBubbles) {
            System.out.print(bubble.getName() + " ");
        }
        System.out.println();
    }

    public static int volumeCalculation(List<Bubble> anyBubbles) {
        int volumeSum = 0;
        for (Bubble bubble : anyBubbles) {
            volumeSum += bubble.getVolume();
        }
        return volumeSum;
    }

}
