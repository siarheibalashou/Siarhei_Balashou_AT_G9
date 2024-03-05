package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class StringsRunner {
    public static void main(String[] args) {
        List<String> listWithSTr = Arrays.asList("мама", "папа", "деть", "мама", "ребенок");
        listWithSTr.stream().sorted().forEach(System.out::println);
        System.out.println();
        listWithSTr.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println("");
        persons.stream().sorted(comparing(Person::getSex).thenComparing(Person::getAge)).forEach(System.out::println);
    }
}
