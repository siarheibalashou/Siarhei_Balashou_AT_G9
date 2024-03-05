package homework.day9;


//15.
//Создать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
//высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно
//Отфильтровать только те стулья, который выше или равны 100 и уже или равны 50
//Отсортировать по высоте, а если высота равна, то по ширине в нисходящем порядке
//На основании существующего потока данных создать новый, в котором каждый новый Chair имеет высоту, деленную на 2, и ширину, умноженную на случайное число от 3 до 8 включительно
//На основании получившегося потока данных создать новый, представляющий собой уникальный набо высот стульев умноженных на их ширину
//Найти наибольшее значение в получившемся потоке
//Создать новый обьект Bubble с обьемом равным найденному наибольшему значению и именем равным найденному наибольшему значению, представленным в виде словесного выражения каждой цифры числа этого значения, указанного чере пробел
//Напечатать строковое значение полученного обьекта в текстовый файл

import homework.day8.absclasses.Bubble;
import homework.day8.absclasses.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45));

        furniture.filter(chair -> chair.getHeight() >= 100 && chair.getWidth() <= 50)
                .sorted(Comparator.comparing(Chair::getHeight).thenComparing(Chair::getWidth))
                .map(chair -> new Chair(chair.getHeight() / 2, chair.getWidth() * random.nextInt(3, 9)))
                .mapToInt(i -> i.getHeight() * i.getWidth())
                .distinct()
                .max()
                .stream()
                .peek(System.out::println)
                .mapToObj(s -> {
                    String[] strSplitted = String.valueOf(s).split("");
                    String bubbleName = "";
                    for (String string : strSplitted) {
                        switch (string) {
                            case "0":
                                bubbleName += "ноль ";
                                break;
                            case "1":
                                bubbleName += "один ";
                                break;
                            case "2":
                                bubbleName += "два ";
                                break;
                            case "3":
                                bubbleName += "три ";
                                break;
                            case "4":
                                bubbleName += "четыре ";
                                break;
                            case "5":
                                bubbleName += "пять ";
                                break;
                            case "6":
                                bubbleName += "шесть ";
                                break;
                            case "7":
                                bubbleName += "семь ";
                                break;
                            case "8":
                                bubbleName += "восемь ";
                                break;
                            case "9":
                                bubbleName += "девять ";
                                break;
                            default:
                                bubbleName += "";
                                break;
                        }
                    }
                    return new Bubble(s, bubbleName.trim());
                }).forEach(bubble -> {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:/CourseProject/Siarhei_Balashou_AT_G9/folder_with_project_files/FurnitureRunner",true))) {
                        String bubbleForWriting=bubble.toString();
                        writer.write(bubbleForWriting);
                    } catch (IOException e) {
                        System.out.println(e.getCause());
                    }
                });

    }
}
