package by.it.romankova.lesson2.object_22_LambdaStreamAPI;

import java.util.stream.IntStream;

public class Lambda7 {
    public static void main(String[] args) {

        IntStream.concat( // конкатенирует/соединяет IntStream а, IntStream b
                IntStream.range(2, 6), // возвращает последовательность элементов от 2 до 6(исключительно)
                IntStream.rangeClosed(-1, 2)) // возвращает последовательность элементов от -1 до 2(включительно)
                .forEach(x -> System.out.format("%s, ", +x)); // format("%s,... " - форматирование, строковое представление аргумента

        System.out.println("\n");

        IntStream.range(5, 30) // возвращает последовательность элементов от 5 до 30(исключительно)
                .limit(12) // оставляет в потоке только 12 первых элементов
                .skip(3) // skip - пропуск, скачек / не включает первых 3 элемента в диапазон
                .limit(6) // лимтирует поток, оставляя в потоке только первые 6 элементов
                .skip(2)
                .forEach(x -> System.out.format("%s, ", +x));

        System.out.println("\n");

        IntStream.range(0, 10) // 0,1,2,3,4,5,6,7,8,9,
                .skip(2) // 2,3,4,5,6,7,8,9,
                .dropWhile(x -> x < 5) // drop - пропускать, сбрасывать / пропускает и не включает в поток, пока х<5
                                       // в потоке останется 5,6,7,8,9
                .limit(3) // 5,6,7
                .forEach(x -> System.out.print(x + ", ")); // 5 6 7

        System.out.println("\n");

        IntStream.range(0, 10) //0,1,2,3,4,5,6,7,8,9
                .skip(3) //3,4,5,6,7,8,9
                .takeWhile(a -> a < 5) // 3,4 - включает в поток, пока  а<5
                .limit(3)
                .forEach(a -> System.out.print(a + ", "));//3, 4

        System.out.println("\n");

        IntStream.range(1, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i)) //1 2 2 3 3 3 4 4 4 4
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n");

        int x = IntStream.range(-2, 2)
                .map(i -> i * 5)
                .reduce(10, Integer::sum);
        System.out.println(x); //x : 0

    }
}
