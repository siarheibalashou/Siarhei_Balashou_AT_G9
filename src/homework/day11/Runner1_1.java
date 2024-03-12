package homework.day11;

import java.util.ArrayList;
import java.util.List;

//1.1
// создать 5 одновременно запускающихся потоков (например, в цикле for), в каждом из которых,
// проитерировать коллекцию из 20 мышей, где каждая пикает


public class Runner1_1 {
    public static void main(String[] args) {
        List<Mouse> listOfMouses = new ArrayList<>();
        for (int mouseNumber = 1; mouseNumber <= 20; mouseNumber++) {
            listOfMouses.add(new Mouse(mouseNumber));
        }
        for (int threadNumber = 1; threadNumber <= 5; threadNumber++) {
            new Thread(() -> {
                for (Mouse mouse : listOfMouses) {
                    mouse.peep();
                }
            }).start();
        }

    }
}
