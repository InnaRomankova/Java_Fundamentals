package by.it.romankova.lesson1.lab1KP;
/*1.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями.
Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех
остальных элементов (min и max в сумму не входят).*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число элементов массива: ");
        int numberOfElements = Integer.parseInt(reader.readLine());

        int [] array = new int[numberOfElements];
        for (int i=0; i<numberOfElements; i++){
            Random random = new Random();
            array [i] = random.nextInt(100);
            System.out.println(array[i]);
        }

        int min=array[0];
        int max=array[0];
        for (int i=1; i<numberOfElements;i++){
            if (array[i]<min){
                min=array[i];
            }
            if (array[i]>max){
                max=array[i];
            }
        }

        int sum =0;
        for (int el: array) {
            if (el == min) {
                continue;
            } else if (el == max) {
                continue;
            } else sum+=el;
        }

        System.out.println("min="+min);
        System.out.println("max="+max);
        System.out.println("Сумма всех остальных чисел: "+sum);

        reader.close();
    }
}
