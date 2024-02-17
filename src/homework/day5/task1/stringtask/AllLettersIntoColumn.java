package homework.day5.task1.stringtask;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllLettersIntoColumn {

    public void lettersIntoColumn(String unparsedString) {
        //  int charNumber = 0;
        //   String tempCharacter = String.valueOf(unparsedString.charAt(charNumber));
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(unparsedString);
        //    char[] charArray = unparsedString.toCharArray();
        //    for (int i = 0; i < charArray.length; i++) {
            //          if (charArray[i]==pattern) {
                //              System.out.println("true");
                //          System.out.println(tempCharacter);
                //          } else System.out.println("false");
            //      }
        while (matcher.find()) {
            System.out.println(unparsedString.substring(matcher.start(), matcher.end()));
        }
    }

}
