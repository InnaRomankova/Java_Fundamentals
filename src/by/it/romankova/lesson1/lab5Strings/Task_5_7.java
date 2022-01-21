package by.it.romankova.lesson1.lab5Strings;
//7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов.
// Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task_5_7 {
    @SuppressWarnings("PointlessBooleanExpression")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int numberOfWords = scanner.nextInt();

        // Записываем слова в массив.
        String[] arrayOfWords = new String[numberOfWords];
        for (int i = 0; i < numberOfWords; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите слово №" + (i + 1) + (": "));
            arrayOfWords[i] = scanner1.next();
        }

        // Проверяем посимвольно каждое слово массива.
        int countOfWords = 0;
        for (int i = 0; i < numberOfWords; i++) {
            boolean count = true;
            for (int j = 0; j < arrayOfWords[i].length() - 1; j++) {
                for (int t = j + 1; t < arrayOfWords[i].length(); t++) {
                    if (arrayOfWords[i].charAt(j) == arrayOfWords[i].charAt(t)) {
                        count = false;
                        break;
                    }
                }
            }
            if (count == true) {
                System.out.println("Первое из найденных слов, состоящее только из различных символов: \"" + arrayOfWords[i] + "\"");
                break;
            } else countOfWords++;
        }
        if (countOfWords == numberOfWords) {
            System.out.println("Среди введенных слов нет слова, состоящего только из различных символов.");
        }
        scanner.close();
    }
}