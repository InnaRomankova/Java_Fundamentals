package by.it.romankova.lesson1.firstControl;
/**
 * 3 Cоздадим список строк, считаем с клавиатуры 5 штук и добавим их в список.
 * Затем с помощью цикла найдем из списка самую длинную строку (или несколько,
 * если она такая не одна). Cамые длинные строки будут выведены на экран.
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task_3 {
    // This constant indicates the size of the list.
    private static final int LIST_SIZE = 5;

    public static void main(String[] args) throws IOException {
        List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(StringInput.stringInput());
        }
        int longestString = arrayList.get(0).length();
        for (String string : arrayList) {
            if (string.length() > longestString) {
                longestString = string.length();
            }
        }
        System.out.println("Самая длинная строка(и): ");
        for (String string : arrayList) {
            if (string.length() == longestString) {
                System.out.println(string);
            }
        }
    }
}

