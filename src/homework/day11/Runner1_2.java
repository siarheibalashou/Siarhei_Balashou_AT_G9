package homework.day11;

//1.2
//- создать 7 одновременно запускающихся потоков (например, в цикле for),
// в каждом из которых, проитерировать коллекцию из 18 мышей, где каждая четная пикает

import java.util.ArrayList;
import java.util.List;

public class Runner1_2 {
    public static void main(String[] args) {
        List<Mouse> listOfMouses = new ArrayList<>();
        for (int mouseNumber = 1; mouseNumber <= 18; mouseNumber++) {
            listOfMouses.add(new Mouse(mouseNumber));
        }
        for (int threadNumber = 1; threadNumber <= 7; threadNumber++) {
            new Thread(() -> {
                for (Mouse mouse : listOfMouses) {
                    if ((listOfMouses.indexOf(mouse) + 1) % 2 == 0) {
                        mouse.peep();
                    }
                }
            }).start();
        }
    }
}