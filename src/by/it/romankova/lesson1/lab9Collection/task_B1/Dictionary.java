package by.it.romankova.lesson1.lab9Collection.task_B1;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary {
    Map<String, Integer> dictionary = new HashMap<>();

    public Dictionary(String text) {
        Pattern pattern = Pattern.compile("[А-яЁёA-z]+");
        Matcher matcher = pattern.matcher(text.toLowerCase());
        while (matcher.find()) {
            String words = matcher.group();
            if (dictionary.containsKey(words)) {
                dictionary.put(words, dictionary.get(words) + 1);
            } else dictionary.put(words, 1);
        }
        System.out.println(dictionary);
    }

    public void getFrequencyDictionary() {
        System.out.println("Частотный словарь для текста: ");
        dictionary.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                forEach(System.out::println);

    }
}
