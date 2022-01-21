package by.it.romankova.lesson1.lab9Collection.task_B1;
/*B1.Имеется текст. Следует составить для него частотный словарь*/

import java.util.Scanner;

public class Task_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        Dictionary dictionary = new Dictionary(text);
        dictionary.getFrequencyDictionary();
    }
}
