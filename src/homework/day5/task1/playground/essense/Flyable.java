package homework.day5.task1.playground.essense;

import javax.xml.namespace.QName;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public interface Flyable {

    default void fly(String direction) {
        String flyMessage = "I am " + this.getClass().getSimpleName() + ", my name is " + getClass().getName() + " and I am flying to " + direction;
        System.out.println(flyMessage);
    }
}
