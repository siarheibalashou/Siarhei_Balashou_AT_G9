package homework.day9;

//12.
//Создать поток данных people класса Person (через new Stream.of) с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
//Отфильтровать людей, которые моложе 60
//Отсортировать в восходящем порядке по именам
//На основании существующего потока данных создать новый, в котором каждый новый Person имеет возраст на 4 года больше исходного
//Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл

import homework.day8.absclasses.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        double avg = people.filter(person -> person.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> new Person(person.getAge() + 4, person.getName()))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/CourseProject/Siarhei_Balashou_AT_G9/folder_with_project_files/PersonRunnerFile"))) {
            writer.write(String.valueOf(avg));
        } catch (IOException e) {
            System.out.println(" ~~~~ ");
        }

    }
}
