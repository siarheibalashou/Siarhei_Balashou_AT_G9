package homework.day8.collectionsforclasses;

import homework.day8.absclasses.Bubble;
import homework.day8.absclasses.Person;

import java.util.ArrayList;
import java.util.List;

//12.
//Создать пустой список людей (класса Person) people (через new ArrayList)
//Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
//Проитерировать список через for-each и отпечатать возраст в консоль через пробел
//Проитерировать список через for-each и отпечатать имена в консоль через пробел
//Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

public class PersonList {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));
        ageOfPersons(people);
        namesOfPersons(people);
        printPersonInfo(people);
    }

    public static void namesOfPersons(List<Person> anyPeople) {
        for (Person person : anyPeople) {
            System.out.print(person.getName() + " ");
        }
        System.out.println();
    }

    public static void ageOfPersons(List<Person> anyPeople) {
        for (Person person : anyPeople) {
            System.out.print(person.getAge() + " ");
        }
        System.out.println();
    }

    public static void printPersonInfo(List<Person> anyPeople) {
        for (int index = 0; index < anyPeople.size(); index++) {
            System.out.printf((anyPeople.get(index).toString()) + "%n");
        }
    }
}
