package by.it.romankova.lesson1.lab3;
/* Имеется целое число, определить является ли это число простым,
т.е. делится без остатка только на 1 и себя.*/
import java.util.Scanner;
public class Task_4_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        int count = 0; // переменная для подсчета делений без остатка
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count == 1) {
            System.out.println("Число " + number + " является простым числом");
        } else {
            System.out.println("Число " + number + " не является простым числом");
        }
    }
}
