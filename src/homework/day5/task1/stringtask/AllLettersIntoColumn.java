package homework.day5.task1.stringtask;

import java.util.regex.Pattern;

//сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста,
// которую принимает на вход в виде аргумента.

public class AllLettersIntoColumn {

    public void lettersIntoColumn(String unparsedString) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        char[] charArray = unparsedString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (pattern.matches("[a-zA-Z]", String.valueOf(charArray[i]))) {
                System.out.println(charArray[i]);
            }
        }
    }

}
