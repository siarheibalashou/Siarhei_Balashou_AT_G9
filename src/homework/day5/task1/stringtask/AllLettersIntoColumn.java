package homework.day5.task1.stringtask;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
