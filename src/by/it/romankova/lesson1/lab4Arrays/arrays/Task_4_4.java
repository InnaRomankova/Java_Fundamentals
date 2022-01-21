package by.it.romankova.lesson1.lab4Arrays.arrays;
/* 4.Создать двухмерный квадратный массив, и заполнить его «бабочкой»,
т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1*/

import java.util.Scanner;

public class Task_4_4 {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the 2D array: ");
        Scanner scanner = new Scanner (System.in);
        int numberOfElements = scanner.nextInt();
        int [][] arrays = new int[numberOfElements][numberOfElements];
        int iterationCaunter=0;
        for (int i=0, j= numberOfElements-1; i<=numberOfElements/2; i++, j--){ // Цикл для заполнения массива единицами
            for (int t= iterationCaunter; t<numberOfElements-iterationCaunter;t++){
                arrays[i][t] = 1;
                arrays[j][t] = 1;
            }
            iterationCaunter++;
        }
        for (int i=0; i<numberOfElements; i++){ // Цикл для вывода на печать
            for (int j=0; j<numberOfElements; j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
