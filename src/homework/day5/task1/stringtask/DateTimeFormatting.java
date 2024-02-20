package homework.day5.task1.stringtask;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public void dateTimeFormatter(String stringDate) throws ParseException {
        DateTimeFormatter stringDateFormat = DateTimeFormatter.ofPattern("HH.mm dd.mm.yyyy");
        LocalDateTime dateTimeFromStringDate = LocalDateTime.parse(stringDate, stringDateFormat);
        DateTimeFormatter formattedStringDate = DateTimeFormatter.ofPattern("MMMM, dd, YYYY HH:mm");
        String formattedDate = dateTimeFromStringDate.format(formattedStringDate);
        System.out.println(formattedDate);

    }
}
