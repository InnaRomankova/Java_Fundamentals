package by.it.romankova.lesson2.object_22_LambdaStreamAPI;

import java.util.Arrays;
import java.util.List;

public class lambda1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12");
        strings
                .stream()
                .filter(string -> string.length() > 2)
                .forEach(string -> System.out.println(string));
    }
}
