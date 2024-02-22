package homework.day7.inputoutput;

import java.io.*;
//читает текст из файла, убирает из него все гласные и записывает новый текст в тот же файл, затирая оригинал.
public class ReadAndRemove {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("file_read_out.txt"));
//            BufferedReader inTemp = new BufferedReader(new FileReader("temp_file.txt"));
//            BufferedWriter outFileReadOut = new BufferedWriter(new FileWriter("file_read_out.txt"));
            String line;
            String textLine = "";
            while ((line = in.readLine()) != null) {
                String parsedLine = line.replaceAll("[aeiouAEIOU]", "");
                textLine += parsedLine;
            }
            in.close();
            BufferedWriter out = new BufferedWriter(new FileWriter("file_read_out.txt"));
            out.write(textLine);
            out.close();

            //        String line2;
//            while ((line2 = inTemp.readLine()) != null) {
//                outFileReadOut.write(line2);
//            }
//            inTemp.close();
//            outFileReadOut.close();
        } catch (IOException e) {
            System.out.println("ALARMALARMALARM");
        }
    }
}

