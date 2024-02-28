package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

//10.
//Создать пустой список стрингов noodles (через new ArrayList)
//Добавить в список 4 вида макарон (стринги Hakka, Ramen, Hibachi, Schezwan)
//Проитерировать список через for-each и отпечатать слова в консоль через тире
//Заменить в каждом слове буквы "а" на букву "о"
//Проитерировать список по индексу и отпечатать слова в консоль через пробел


public class Noodles {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String noodle : noodles) {
            if (noodles.indexOf(noodle) != noodles.size() - 1) {
                System.out.print(noodle + "-");
            } else System.out.println(noodle);
        }

        charReplacer(noodles, "a", "o");
        System.out.println(charReplacerVerTwo(noodles));

    }

    public static void charReplacer(List<String> anyList, String regex, String replace) {

        for (String string : anyList) {
            String newRow = string.replaceAll(regex, replace);
            System.out.print(newRow + " ");

        }
    }

    public static List<String> charReplacerVerTwo(List<String> anyList) {
        //not working variant (no need to review)
        for (int i = 0; i < anyList.size(); i++) {
            anyList.set(i,anyList.get(i).replaceAll("a", "o"));
        }

        return anyList;
    }
}
