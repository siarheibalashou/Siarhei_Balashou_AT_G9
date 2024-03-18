package homework.day11;

import java.util.Iterator;
import java.util.List;

public class UtilitaryClass {

    public synchronized static void removeListElement(List<Mouse> mouseList) {
        Iterator<Mouse> iterator = mouseList.listIterator();

        while (iterator.hasNext()) {
            iterator.next().peep();
            iterator.remove();
        }
    }

    public synchronized static void removeListElementsWitDelay(List<Mouse> mouseList) {
        Iterator<Mouse> iterator = mouseList.listIterator();

        while (iterator.hasNext()) {
            iterator.next().peep();
            iterator.remove();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.getCause();
            }
        }
    }
}
