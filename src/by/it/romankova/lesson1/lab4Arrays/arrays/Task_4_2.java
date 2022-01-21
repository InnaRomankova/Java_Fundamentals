package by.it.romankova.lesson1.lab4Arrays.arrays;
/*2. Определите сумму элементов массива, расположенных между минимальным
     и максимальным значениями.*/

import java.util.Random;
import java.util.Scanner;

public class Task_4_2 {
    public static void main(String[] args) {
        System.out.println("Выберем число элементов массива. Введите целое число больше 0: ");
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            while (!scanner.hasNextInt()){
                System.out.println("Вы ввели не целое число больше 0, а явно что-то другое. Попробуйте еще раз! Введите целое число больше 0: ");
                scanner.next();
            }
            number = scanner.nextInt();
            if (number < 1){
                System.out.println("Введенное вами число не больше 0. Попробуйте еще раз! Введите целое число больше 0: ");
            }
        } // Этот цикл только для проверки ввода, чтобы введенное число было больше 0.
        while (number<1);
        System.out.println("Вы выбрали длину массива: "+number);
        System.out.println("Заполним массив рандомными числами: ");
        Random random = new Random(); // Диапазон чисел возьмем не большой от 0 до 15, просто чтобы легче было перепроверить работу программы
        int [] array = new int[number];
        for (int i=0; i<array.length; i++){ // Цикл для наполнения массива рандомными числами
            array [i] = random.nextInt(15);
        }
        for(int element: array)
            System.out.print(element+ " ");
        System.out.println();
        System.out.println("Теперь определим сумму элементов массива между минимальным и максимальным значениями.");
        System.out.println("Если таких значений несколько, то между первым минимальным и последним максимальным значениями (включительно).");
        // Находим среди элементов массива первое минимальное значение:
        int min= array[0];
        int positionOfMinElement = 0;
        for (int i=1; i< array.length; i++){
            if (array[i]< min){
                min = array[i];
                positionOfMinElement = i;
            }
        }
        System.out.println("Первое из минимальных значение: " + min+ " под индексом: " + positionOfMinElement);
        int max= array[0];
        int positionOfMaxElement = 0;
        for (int i=array.length-1; i> 0; i--){
            if (array[i]> max){
                max = array[i];
                positionOfMaxElement = i;
            }
        }
        System.out.println("Последнее из максимальных значение: " + max+ " под индексом: " + positionOfMaxElement);
        int total = 0;
        if (positionOfMinElement < positionOfMaxElement){
            for (int i = positionOfMinElement; i<=positionOfMaxElement; i++){
                total += array[i];
            }
        }
        else if (positionOfMaxElement< positionOfMinElement){
            for (int i = positionOfMaxElement; i<=positionOfMinElement; i++){
                total += array[i];
            }
        }
        else {
            total=array[0];
        }
        System.out.println("Сумма элементов массива между минимальным и максимальным значениями: "+ total);
        scanner.close();
    }
}
