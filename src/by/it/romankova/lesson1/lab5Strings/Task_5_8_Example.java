package by.it.romankova.lesson1.lab5Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_8_Example {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество слов: ");
        int num = Integer.parseInt(in.readLine());
        String[] words = new String[num];
        int n = 0;
        String word_finish = null;
        for (int i = 0; i < num; i++) {
            System.out.print("Слово №" + (i + 1) + ": ");
            words[i] = in.readLine();
        }
        for (int i = 0; i < num; i++) {
            char[] temp_word = words[i].toCharArray();
            int size_word = temp_word.length;
            Pattern p = Pattern.compile("^[\\d]+$");
            Matcher matcher = p.matcher(words[i]);
            if (matcher.find()) {
                if (size_word > 1) {
                    int temp = 0;
                    for (int j = 0; j < size_word / 2; j++) {
                        if (temp_word[j] != temp_word[size_word - j - 1]) break;
                        else temp++;
                    }
                    if (temp == size_word / 2) {
                        n++;
                        if (n == 3) break;
                        word_finish = new String(temp_word);
                    }
                }
            }
        }
        switch (n) {
            case 0:
                System.out.println("Нет слов-палиндромов, состоящих только из цифр");
                break;
            case 1:
                System.out.println("Одно слово-палиндром, состоящее только из цифр: " + word_finish);
                break;
            case 2:
                System.out.println("Два слова-палиндрома, состоящие только из цифр, и второе из них: " + word_finish);
                break;
            default:
                System.out.println("Количество слов-палиндромов, состоящих только из цифр, больше двух и второе из них: " + word_finish);
        }
    }
}
