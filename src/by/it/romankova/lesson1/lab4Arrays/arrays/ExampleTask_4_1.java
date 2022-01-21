package by.it.romankova.lesson1.lab4Arrays.arrays;

import java.util.Scanner;

public class ExampleTask_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max;
        int student;
        int position=0;
        System.out.println("Enter a number of students , don't enter zero");
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("This is not a number. Please try again");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("You enter Zero, please try again");
            }
        }
        while (number == 0);
        int[] mas = new int[number];
        for (int i = 0; i < mas.length; i++) { // заполнение массива рандомными оценками
            mas[i] = (int) (1 + Math.random() * 100);
            student=i+1;
            System.out.println("student number "+student+": " +mas[i]);
        }
        max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i]>max){
                max=mas[i];
                position=i+1;
            }
        }
        System.out.println("");
        System.out.println("Max grade position:"+position);
    }
}
