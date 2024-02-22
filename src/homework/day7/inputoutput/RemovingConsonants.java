package homework.day7.inputoutput;

import java.io.*;

//- читает текст из файла, убирает из него все согласные и записывает новый
// текст в тот же файл в конец, через пустую строку ниже оригинал.
public class RemovingConsonants {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("removing_all_consonants.txt"));
            String lineWoСonsonants = "";
            String line;
            while ((line = reader.readLine()) != null) {
                lineWoСonsonants += line;
            }
            reader.close();
            String replacedLineWoConsonants = lineWoСonsonants.replaceAll("[^aeiouAEIOU]", "");
            BufferedWriter writer = new BufferedWriter(new FileWriter("removing_all_consonants.txt", true));
            writer.write("\n\n"+ replacedLineWoConsonants);
            writer.close();
        } catch (IOException e) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

}