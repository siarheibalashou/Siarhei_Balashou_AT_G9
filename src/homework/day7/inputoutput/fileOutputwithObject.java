package homework.day7.inputoutput;

import homework.day5.task1.playground.essense.craft.air.Copter;
import homework.day5.task1.playground.essense.craft.air.Plane;

import java.io.*;

public class fileOutputwithObject {
    public static void main(String[] args) {
        Plane copterForTextFile = new Plane(3222, "Hellacopter");
        try {
            FileOutputStream fos = new FileOutputStream("file_with_Copter");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(copterForTextFile);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("lyalyalya");
        }
    }
}
