package by.it.romankova.lesson1.lab4Arrays.arrays;
// 1.В задаче на поиск максимальной оценки, вывести не саму оценку, а ее номер.

import java.util.Random;

public class Task_4_1 {
    public static void main(String[] args) {
        int [] arrayMarks = new int[7]; // Создаем массив для внесения значений оценок, например, на 7 элементов
        System.out.print("У нас есть оценки: ");
        Random random = new Random(); // Оценки будем получать рандомно
        for (int i =0; i<arrayMarks.length; i++){ // В этом цикле получим оценки рандомно
            arrayMarks[i] = random.nextInt(10);
        }
        for (int x: arrayMarks){ // Цикл выводит на печать значения полученных рандомно оценок
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Максимальная оценка под номером (номерами): ");
        int maxMark = arrayMarks[0]; // Создаем переменную, которой впоследствии присвоим значение максимальной оценки
        for (int i=1; i<arrayMarks.length; i++) { // В этом цикле определим значение максимальной оценки
            if (arrayMarks[i] > maxMark) {
                maxMark = arrayMarks[i];
            }
        }
        int [] arrayMaxNumbers = new int[7]; // Создаем новый массив для номеров максимальных оценок
        for (int i=0; i<arrayMarks.length; i++){ // Максимальных оценок может быть несколько, поместим их номера в массив
            if (arrayMarks[i]==maxMark){
                arrayMaxNumbers[i] = i+1; // В этот массив помещаем только номера максимальных оценок, остальные элементы этого массива будут равны "0"
            }
        }
        for (int i=0; i<arrayMaxNumbers.length; i++){ // Цикл для вывода на печать номера (номеров) максимальных оценок
            if (arrayMaxNumbers[i] > 0) {
                System.out.print(arrayMaxNumbers[i]+ " ");
            }
        }


    }
}
