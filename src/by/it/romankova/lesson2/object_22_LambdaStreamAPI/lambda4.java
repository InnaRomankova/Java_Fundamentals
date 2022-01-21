package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// выводим на печать длину строк. Интерфейс Consumer, метод forEach

import java.util.Arrays;
import java.util.List;

public class lambda4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12");
        strings.forEach(string -> System.out.println(string.length()));
    }

}
