package homework.day5.task1.stringtask;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public void dateTimeFormatter(String stringDate) throws ParseException {
        String[] array = stringDate.split("\\s+");
        String time = array[0];
        String date = array[1];
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH.mm");
        Time time1 = (Time) simpleDateFormat.parse(time);
        System.out.println(time);
    }
}
