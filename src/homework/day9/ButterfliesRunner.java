package homework.day9;

import java.util.ArrayList;
import java.util.List;

//1.
//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
//Добавить к каждому элементу кавычки
//Оставить только те слова, которые содержат букву "a" и букву "о"
//Вывести слова в консоль с новой строки

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        List<String> bf = butterflies.stream().map(string -> string.replaceFirst("", "\"")).map(string -> string.concat("\"")).filter(string -> string.contains("a") && string.contains("o")).toList();

        for (String bfly : bf) {
            System.out.println(bfly);
        }
    }
}
