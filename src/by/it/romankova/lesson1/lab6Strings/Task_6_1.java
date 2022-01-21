package by.it.romankova.lesson1.lab6Strings;
// 1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
//общее их количество

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_6_1 {
    public static void main(String[] args) {
        // Записываем строку.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        // Находим в строке знаки препинания.
        Pattern pattern = Pattern.compile("\\Q...\\E|[.,!?:;)\"(]");
        Matcher matcher = pattern.matcher(string);
        int count =0;
        while (matcher.find()) {
            count++;
            System.out.print(matcher.group()+" ");
        }
        System.out.println("\nОбщее количество знаков препинания в строке: "+count);
        scanner.close();
    }
}
