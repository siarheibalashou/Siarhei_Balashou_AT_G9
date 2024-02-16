package homework.day5.task1.stringtask;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class CurrentDateIntoConsole {
    public void displayCurrentDateTime() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD MMMM, YYYY, ");
        String currentDateTime = simpleDateFormat.format(now);
        System.out.println("Сейчас на дворе: " + currentDateTime);
    }
}