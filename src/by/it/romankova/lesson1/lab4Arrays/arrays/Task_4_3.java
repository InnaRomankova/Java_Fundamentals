package by.it.romankova.lesson1.lab4Arrays.arrays;
/* 3.Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

import java.util.Random;
import java.util.Scanner;

public class Task_4_3 {
    public static void main(String[] args) {
        System.out.println("Создаем массив. Введите число элементов массива (больше 1): ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElements;
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Вы ввели что-то другое. Повторите ввод! Введите число больше 1: ");
                scanner.next();
            }
            numberOfElements = scanner.nextInt();
            if (numberOfElements<2){
                System.out.println("Введенное вами число не больше 1. Попробуйте еще раз! Введите целое число больше 1: ");
            }
        } // Этот цикл для проверки правильности ввода числа
        while (numberOfElements<2);
        int [] array = new int[numberOfElements];
        Random random = new Random();
        System.out.print("Заполняем массив случайными элементами: ");
        for (int i=0; i<numberOfElements; i++){
            array[i]= random.nextInt(100);
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.print("Теперь перевернем массив и выведем на печать: ");

        for (int i=0, j=0, t=array.length-1; i<=array.length/2; i++, t--){
           j= array[i];
           array[i]=array[t];
           array[t]=j;
        }
        for (int element: array){
            System.out.print(element+" ");
        }
        scanner.close();
    }
}
