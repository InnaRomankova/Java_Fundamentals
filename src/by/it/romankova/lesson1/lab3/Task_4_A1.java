package by.it.romankova.lesson1.lab3;
//Имеется целое число. Следует посчитать сумму цифр данного числа.
import java.util.Scanner;
public class Task_4_A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        int sum = 0; // переменная для подсчета суммы цифр числа
        int a = 0; // переменная для записи остатка от деления по модулю
        while (number>0) {
            a = number % 10;
            sum=sum+a;
            number/=10;
        }
        System.out.println("Сумма цифр данного числа: "+sum);
    }
}
