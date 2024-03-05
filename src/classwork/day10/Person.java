package classwork.day10;

public class Person {

    public int age;
    public String name;
    public Sex sex;

    public Person(String name, int age, Sex sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public enum Sex {
        MAN, WOMEN
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}