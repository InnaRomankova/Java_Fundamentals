package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// сортировка List по длине строк

import java.util.*;

public class lambda2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(),s2.length());
            }
        });
        for (String string: strings){
            System.out.println(string);
        }
        Collections.sort(strings,(s1, s2) -> Integer.compare(s2.length(),s1.length()));
        for (String string: strings){
            System.out.println(string);
        }

    }
}
