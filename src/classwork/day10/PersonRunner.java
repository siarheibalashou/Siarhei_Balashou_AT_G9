package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(persons.stream().filter(person -> person.age > 18)
                .filter(person -> (person.sex == Person.Sex.WOMEN && person.age <= 55) || (person.age <= 60 && person.sex == Person.Sex.MAN))
                .count());
    }
}

