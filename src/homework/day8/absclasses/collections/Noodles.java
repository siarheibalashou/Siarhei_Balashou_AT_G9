package homework.day8.absclasses.collections;

import java.util.ArrayList;
import java.util.List;

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
    }

    public static void charReplacer(List<String> anyList, String regex, String replace) {

        for (String string : anyList) {
            String newRow = string.replaceAll(regex, replace);
            System.out.print(newRow + " ");

        }
    }

    public static ArrayList charReplacerVerTwo(ArrayList<String> anyList) {   //not working variant
        for (int i = 0; i < anyList.size(); i++) {
            anyList.get(i).replaceAll("a", "o");
        }
        return anyList;
    }
}
