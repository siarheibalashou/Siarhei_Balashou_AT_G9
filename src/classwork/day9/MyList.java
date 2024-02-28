package classwork.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        System.out.println(list.stream().filter(string -> string.equalsIgnoreCase("мама")).count());
        //1
        String anyStr = list.stream().findFirst().orElse("мама");
        System.out.println(anyStr);

        //2
        Optional strwith = list.stream().filter(string -> string.equalsIgnoreCase("мама")).findFirst();
        System.out.println(strwith);

        //3
        Optional<String> fifthElement = list.stream().skip(4).findFirst();
        System.out.println(fifthElement);

        //4
        List<String> twoElements = list.stream().skip(2).limit(2).toList();
        System.out.println(twoElements);

        //5
        List<String> containsM = list.stream().filter(string -> string.contains("м")).distinct().toList();
        System.out.println(containsM);
    }
}
