package by.it.romankova.lesson1.lab3;
//1. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class Task_4_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = scanner.nextInt();
        int factorial = 1; // Переменная для подсчета значения факториала введенного числа
        for (int i=1; i<=n; i++){
            factorial*=i;
        }
        System.out.println("Факториал числа " + n + " равен " + factorial);
    }
}
