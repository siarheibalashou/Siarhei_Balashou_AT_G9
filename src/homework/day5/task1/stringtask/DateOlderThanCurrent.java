package homework.day5.task1.stringtask;

//1.7 написать метод, который принимает на вход строку текста и
// выводит в консоль дату, которая на n дней больше, чем текущая в формате
// "Сгенерированная гласная дата: 7 мая",
// где n - это количество гласных буков в получаемой строке


import java.util.Calendar;

public class DateOlderThanCurrent {
    public void dateOlderThanCurrent(String unparsedString) {
        String parsedStr = unparsedString.replaceAll("[^aeiouAEIOU]", "");
        String[] strArrayWithSpaces = parsedStr.replace("", " ").trim().split("\\s");
        int vowelsInString = strArrayWithSpaces.length;
        Calendar timestamp = Calendar.getInstance();
        timestamp.add(Calendar.DAY_OF_MONTH, +vowelsInString);
        String date = String.valueOf(timestamp.getTime());
        System.out.printf("Сгенерированная гласная дата: %s", date).println();
    }
}
