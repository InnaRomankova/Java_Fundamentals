package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// метод collect, класс Collectors, преобразуем поток в List

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lambda6toList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12");
        List <String> result = strings
                .stream() // создаем поток
                .filter(string -> string.length() > 2) // фильтруем, оставляя только строки длиной больше 2
                . map(string -> string+string) // метод map преобразовывает каждый элемент стрима во что-то другое
                . collect(Collectors.toList()); // преобразуем поток строк в toList
        System.out.println(result);

    }
}