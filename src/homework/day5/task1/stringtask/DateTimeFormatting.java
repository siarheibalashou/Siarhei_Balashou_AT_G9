package homework.day5.task1.stringtask;


import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//написать метод, который принимает на вход строку с датой и временем в формате "22.00 07.09.2020"
// и выводит в консоль в формате "September, 7, 2020 22:00"

public class DateTimeFormatting {
    public void dateTimeFormatter(String stringDate) throws ParseException {
        DateTimeFormatter stringDateFormat = DateTimeFormatter.ofPattern("H.m dd.MM.yyyy");
        LocalDateTime dateTimeFromStringDate = LocalDateTime.parse(stringDate, stringDateFormat);
        DateTimeFormatter formattedStringDate = DateTimeFormatter.ofPattern("MMMM, d, YYYY HH:mm");
        String formattedDate = dateTimeFromStringDate.format(formattedStringDate);
        System.out.println(formattedDate);
    }
}
