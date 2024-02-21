package homework.day7.inputoutput;

import java.io.*;

public class readAndRemove {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("file_read_out.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("temp_file.txt"));

            String line;
            while ((line = in.readLine()) != null) {
              String parsedLine= line.replaceAll("[aeiouAEIOU]", "");
                out.write(parsedLine);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println("ALARMALARMALARM");
        }
    }
}

