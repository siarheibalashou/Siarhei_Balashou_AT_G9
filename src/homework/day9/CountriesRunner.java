package homework.day9;

import java.util.stream.Stream;

//5.
//Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//Отфильтровать страны, в названии которых меньше 7 букв
//Перевести все страны в верхний регистр
//Добавить к каждому названию кавычки
//Отпечатать в консоль с новой строки

public class CountriesRunner {
    public static void main(String[] args) {

        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(string -> string.matches(".*[ауоиэыяюеёАУОИЭЫЯЮЕЁ]")&& string.length()<7).map(String::toUpperCase).map(string -> string.replaceFirst("", "\"")).map(string -> string.concat("\"")).forEach(System.out::println);

    }


}
