package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// метод collect, класс Collectors, преобразуем поток в Set
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class lambda6еtoSet {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12", "1234");
        Set<String> result = strings
                .stream() // создаем поток
                .filter(string -> string.length() > 2) // фильтруем, оставляя только строки длиной больше 2
                . map(string -> string+string) // метод map преобразовывает каждый элемент стрима во что-то другое
                . collect(Collectors.toSet()); // преобразуем поток строк в toList
        System.out.println(result);

    }
}
