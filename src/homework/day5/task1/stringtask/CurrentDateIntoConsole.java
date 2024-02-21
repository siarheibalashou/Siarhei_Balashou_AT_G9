package homework.day5.task1.stringtask;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Locale;

public class CurrentDateIntoConsole {
    public void displayCurrentDateTime() {
        System.out.printf("Cейчас на дворе: %d %s, %d, %d часа %d минут", LocalDateTime.now().getDayOfMonth(), LocalDateTime.now().getMonth(), LocalDateTime.now().getYear(), LocalTime.now().getHour(), LocalDateTime.now().getMinute()).println();
    }
}