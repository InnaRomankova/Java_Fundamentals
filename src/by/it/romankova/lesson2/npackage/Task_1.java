package by.it.romankova.lesson2.npackage;
//Найти в массиве чисел с наибольш. и наим. значениями,+ сумму все остальных, кроме мин и макс

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int maxNum;
        int minNum;
        int[] arrayNumbers = new int[10];
        Random random = new Random();
        for (int i =0; i<arrayNumbers.length; i++){
            arrayNumbers[i] = random.nextInt(6);
        }
        for (int x:arrayNumbers ){
            System.out.print(x+" ");
        }

        maxNum = arrayNumbers[0];
        minNum = arrayNumbers[0];

        for (int i=1; i<arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNum) {
                maxNum = arrayNumbers[i];
            }
            if (arrayNumbers[i] < minNum) {
                minNum = arrayNumbers[i];
            }
        }
        System.out.println("\n"+maxNum);
        System.out.println(minNum);
        int counter=0;
        for (int arrayNumber : arrayNumbers) {
            if ((arrayNumber != maxNum) & (arrayNumber != minNum)) {
                counter = counter + arrayNumber;
            }
        }
        System.out.println(counter);
    }
}
