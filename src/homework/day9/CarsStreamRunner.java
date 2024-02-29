package homework.day9;

import java.util.stream.Stream;

//4.
//Создать поток данных стрингов из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) (через Stream.of())
//Оставить в потоке только уникальные названия авто
//Отфильтровать только те названия, которые содержат букву "и"
//Пропустить 1 название
//Все названия привести в верхний регистр
//Отпечатать все названия в консоль с новой строки



public class CarsStreamRunner {
    public static void main(String[] args) {
        Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
        cars.distinct().filter(string -> string.contains("и")).skip(1).map(String::toUpperCase).forEach(System.out::println);

    }


}
