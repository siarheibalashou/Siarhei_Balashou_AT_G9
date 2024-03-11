package homework.day11;

//1.3
//- в главном потоке создать коллекцию из 280 мышей,
// далее создать 5 дочерних потоков (например, в цикле for),
//в каждом из которых удалять 1 пикающую мышь, пока коллекция не станет пустой

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static homework.day11.UtilitaryClass.removeListElement;

public class Runner1_3 {
    public static void main(String[] args) {
        List<Mouse> listOfMouses = new ArrayList<>();
        List<Mouse> synchronizedListOfMouses = Collections.synchronizedList(listOfMouses);

        for (int mouseNumber = 1; mouseNumber <= 280; mouseNumber++) {
            synchronizedListOfMouses.add(new Mouse(mouseNumber));
        }

        for (int threadNumber = 1; threadNumber <= 5; threadNumber++) {
            new Thread(() -> {
                removeListElement(synchronizedListOfMouses);
            }).start();
        }
    }
}
