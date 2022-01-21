package by.it.romankova.lesson1.Lab2;
import java.util.Scanner;
public class Task_3_A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых попарно неравных между собой числа");
        int zero = scanner.nextInt();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int[] array = {zero,first,second};
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }

    }
}
