package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// метод collect, класс Collectors, преобразуем поток в Map
// метод distinct() фильтрует все повторяющиемя элементы. Нам нужен, т.к. в Map нельзя, чтобы было два одинаковых ключа
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class lambda6еtoMap {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("", "1", "2", "3", "4", "2", "2");
        Map<String, Integer> result = strings
                .stream() // создаем поток
                .filter(string -> string.length() >= 1) // фильтруем, оставляя только строки длиной больше 2
                . map(string -> string+string) // метод map преобразовывает каждый элемент стрима во что-то другое
                . distinct() // фильтрует все повторяющиемя элементы
                . collect(Collectors.toMap(string->string, string-> Integer.valueOf(string)*3)); // преобразуем поток строк в toList
        System.out.println(result);

    }
}
