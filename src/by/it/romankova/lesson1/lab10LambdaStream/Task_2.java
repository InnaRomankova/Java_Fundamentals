package by.it.romankova.lesson1.lab10LambdaStream;
/*2. Считать с консоли данные(массив слов). Записать в другую переменную String строку(через запятую слова),
длина которых строго больше 6. В конце запятой не должно быть. */


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input line: ");
        String s = scanner.nextLine();
        List<String> words = Arrays.asList(s.split(" "));

        String result = words
                .stream() // поток
                .filter(word -> word.length() > 6) // фильтруем, оставляя только слова длиной больше 6
                .collect(Collectors.joining(", ")); // разделитель - запятая
        System.out.println(result);
        scanner.close();
    }
}
