package homework.day9;


//14.
//Создать пустой список песка (класса Sand) sandbox (через new ArrayList)
//Заполнить 5 объектами песка с весом (12, 8, 15, 7, 11) и именами (Речной, Речной, Карьерный, Карьерный, Речной) соответственно
//Отфильтровать только тот песок, который весит больше 9 и имя которого содержит букву "ч"
//Отсортировать по весу в восходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Sand имеет вес умноженный на 2, и имя в верхнем регистре
//На основании получившегося потока данных создать коллекцию Map, где ключ - это вес, а значение - имя
//Отпечатать каждый из элементов карты в виде value:key в текстовый файл

import homework.day8.absclasses.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();
        sandbox.add(new Sand(12, "Речной"));
        sandbox.add(new Sand(8, "Речной"));
        sandbox.add(new Sand(15, "Карьерный"));
        sandbox.add(new Sand(7, "Карьерный"));
        sandbox.add(new Sand(11, "Речной"));

        Map<Integer, String> sandMap = sandbox.stream()
                .filter(sand -> (sand.getWeight() > 9) && (sand.getName().contains("ч")))
                .sorted(Comparator.comparing(Sand::getWeight))
                .map(sand -> new Sand(sand.getWeight() * 2, sand.getName().toUpperCase()))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        System.out.println(sandMap);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/CourseProject/Siarhei_Balashou_AT_G9/folder_with_project_files/SandRunnerFile"))) {
            for (Map.Entry<Integer, String> sand : sandMap.entrySet()) {
                writer.write(sand.getValue() + ":" + sand.getKey());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("cathced io");
        }
    }
}
