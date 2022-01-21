package by.it.romankova.lesson1.Lab2;

import java.util.Scanner;

public class Task_3_B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i=0; i<=number; i++){
            sum+=i;
        }
        System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
    }


}
