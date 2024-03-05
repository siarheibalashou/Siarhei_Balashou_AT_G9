package homework.day9;

//6.
//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        birds.stream()
                .map(string -> string.replace("о", "а"))
                .map(String::toLowerCase)
                .map(string -> string.concat(""))
                .map(string -> string.replaceAll("ь", "").split("б"))
                .forEach(strings -> System.out.printf("--%s--", strings));

    }
}
