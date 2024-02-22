package homework.day7.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//читает текст из файла, считает в тексте количество символов и выводит результат в консоль.

public class NumberOfSymbols {
    public void numberOfSymbols() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("number_of_symbols.txt"));
            String line;
            String fullText = "";
            while ((line = reader.readLine()) != null) {
                fullText += line;
            }
            reader.close();
            String replacedStr = fullText.replaceAll("\\s", "");
            System.out.println(replacedStr.length());
        } catch (IOException e) {
            System.out.println("lalalalala");
        }
    }

    public static void main(String[] args) {
        NumberOfSymbols numberOfSymbols = new NumberOfSymbols();
        numberOfSymbols.numberOfSymbols();
    }
}
