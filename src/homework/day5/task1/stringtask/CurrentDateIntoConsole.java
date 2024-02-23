package homework.day5.task1.stringtask;

import java.time.LocalDateTime;
import java.time.LocalTime;

//написать метод, который выводит в консоль текущую дату и время в формате:
//Сейчас на дворе: 19 сентября, 2020, 3 часа 13 минут

public class CurrentDateIntoConsole {
    public void displayCurrentDateTime() {
        System.out.printf("Cейчас на дворе: %d %s, %d, %d часа %d минут", LocalDateTime.now().getDayOfMonth(), LocalDateTime.now().getMonth(), LocalDateTime.now().getYear(), LocalTime.now().getHour(), LocalDateTime.now().getMinute()).println();
    }
}