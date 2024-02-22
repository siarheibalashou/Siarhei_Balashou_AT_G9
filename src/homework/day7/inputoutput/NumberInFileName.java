package homework.day7.inputoutput;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
// читает текст из файла, считает в тексте количество символов и записывает результат в новый файл,
// имя которого строится по маске текущая_дата_время_количество.

public class NumberInFileName {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("number_of_symbols.txt"));
            String line;
            String fullText = "";
            while ((line = reader.readLine()) != null) {
                fullText += line;
            }
            reader.close();
            Integer numberOfSymbols = fullText.replaceAll("\\s", "").length();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMYYYY_HHmm");
            Date now = new Date();
            String dateTimeString = simpleDateFormat.format(now);
            String fileName = String.format("%s_%d", dateTimeString, numberOfSymbols);
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(numberOfSymbols.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("lalalalala");
        }
    }
}
