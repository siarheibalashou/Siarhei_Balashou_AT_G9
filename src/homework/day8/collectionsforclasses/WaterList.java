package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Water;

import java.util.Arrays;
import java.util.List;

//13.
//Создать список воды (класса Water) water из 3 объектов воды с цветом (Прозрачная, Прозрачная, Мутная) и запахом (Нет, Нет, Аммиачный) соответственно, через (Arrays.asList())
//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

public class WaterList {
    public static void main(String[] args) {
        List<Water> water = Arrays.asList(new Water("Прозрачная", "Нет"), new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный"));
        for (Water i : water) {
            System.out.printf("%s - %s", i.getColor(), i).println();
        }
    }
}
