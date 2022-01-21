package by.it.romankova.lesson1.lab3;
//2. Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class Task_4_B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число:" );
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number<1){
                System.out.println("У числа '"+number+"' нет положительных делителей.");
            }
            else{
                System.out.print("Все положительные делители натурального числа '" + number +"': ");
                for (int i=1; i<=number; i++){
                    if (number%i==0) {
                        System.out.print(i);
                        if (i < number){
                            System.out.print(", ");
                        } else System.out.print(".");
                    }
                }
            }
        }
        else {
            System.out.println("Вы ввели явно не натуральное число. Перезапустите программу и попробуйте снова!");
        }
        scanner.close();
    }
}
