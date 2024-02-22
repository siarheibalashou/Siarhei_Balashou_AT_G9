package homework.day7.inputoutput;

import homework.day5.task1.playground.essense.craft.air.Plane;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//создает какой-нибудь обьект класса (добавить имплементацию интерфеса Serializable) из пакета playground.essence и записывает его в файл
public class FileOutputwithObject {
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
