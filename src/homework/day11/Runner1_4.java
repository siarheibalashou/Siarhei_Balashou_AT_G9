package homework.day11;

//1.4
//- в главном потоке создать коллекцию из 380 мышей, далее создать 7 дочерних потоков (например, в цикле for),
// в каждом из которых каджые 250мс удалять 1 пикающую мышь, пока коллекция не станет пустой

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static homework.day11.UtilitaryClass.removeListElementsWitDelay;

public class Runner1_4 {
    public static void main(String[] args) {
        List<Mouse> listOfMouses = new ArrayList<>();
        List<Mouse> synchronizedListOfMouses = Collections.synchronizedList(listOfMouses);

        for (int mouseNumber = 1; mouseNumber <= 380; mouseNumber++) {
            synchronizedListOfMouses.add(new Mouse(mouseNumber));
        }

        for (int threadNumber = 1; threadNumber <= 7; threadNumber++) {
            new Thread(() -> {
                removeListElementsWitDelay(synchronizedListOfMouses);
            }).start();
        }

    }
}
