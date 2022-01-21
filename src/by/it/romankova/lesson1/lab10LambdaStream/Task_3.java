package by.it.romankova.lesson1.lab10LambdaStream;
/*3. Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String string1 = bufferedReader.readLine();

        String string2 = Stream.of(string1.split(" "))
                .filter(string -> string.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.println(string2);

        bufferedReader.close();
    }

}
