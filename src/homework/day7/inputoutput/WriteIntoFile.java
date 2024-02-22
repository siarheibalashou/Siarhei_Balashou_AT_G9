package homework.day7.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//записывает в файл фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль с клавиатуры.
public class WriteIntoFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scannedString = String.valueOf(scanner.next());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file_write_into_file.txt"));
            String output = "Hello, I just got " + scannedString + " from you!";
            bufferedWriter.write(output);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("ALARMALARMALARM");
        }
    }
}
