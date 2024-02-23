package homework.day5.task1.stringtask;

import java.text.ParseException;

public class StringRunner {
    public static void main(String[] args) throws ParseException {
//        AllLettersIntoColumn allLettersIntoColumn = new AllLettersIntoColumn();
//        allLettersIntoColumn.lettersIntoColumn("fsdafg1!1dfffasd!sdddd&^№efgg");
//        DuplicationItemsArray duplicationItemsArray = new DuplicationItemsArray();
        CurrentDateIntoConsole currentDateIntoConsole = new CurrentDateIntoConsole();
        currentDateIntoConsole.displayCurrentDateTime();
//        duplicationItemsArray.duplicationItemsFinder("fdgdfg 3r3 vbrgrgrg");
        DateTimeFormatting dateTimeFormatting = new DateTimeFormatting();
        dateTimeFormatting.dateTimeFormatter("22.00 07.09.2020");
        DigitsFromString digitsFromString = new DigitsFromString();
        digitsFromString.digitsToArray("as123123 34 343434asdasd 33 3 0");
        DateOlderThanCurrent dateOlderThanCurrent = new DateOlderThanCurrent();
        dateOlderThanCurrent.dateOlderThanCurrent("asdasd 333 sdgffff YuuuuuuUUUUUYYyyyyddd!@#");
    }
}
