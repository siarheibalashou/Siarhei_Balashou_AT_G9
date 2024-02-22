package homework.day7.inputoutput;

import homework.day5.task1.playground.essense.craft.air.Plane;

import java.io.*;

// читает какой-нибудь обьект класса (добавить имплементацию интерфеса Serializable) из пакета playground.essence из файла
// (например, записанный в предыдущем задании) и записывает в другой текстовый файл результат возвращаемого значения
// метода toString() этого обьекта
public class ReadObjectFromFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file_with_Copter");
            BufferedWriter bf = new BufferedWriter(new FileWriter("sdfgsdghsdhsdhsdhsdhsdhds.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Plane copterFromFile = ((Plane) ois.readObject());
            ois.close();
            String stringToFile = copterFromFile.toString();
            bf.write(stringToFile);
            bf.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("lialialia");
        }
    }
}
