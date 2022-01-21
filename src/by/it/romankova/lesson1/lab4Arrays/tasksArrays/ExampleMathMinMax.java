package by.it.romankova.lesson1.lab4Arrays.tasksArrays;
// поиск максимальной(минимальной) оценки
import java.util.Random;

public class ExampleMathMinMax {
    public static void main(String[] args) {
        int[] arrayMarks = new int[7]; // Создаем массив для внесения значений оценок, например, на 7 элементов
        System.out.print("У нас есть оценки: ");
        Random random = new Random();
        for (int i = 0; i < arrayMarks.length; i++) {
            arrayMarks[i] = random.nextInt(10);
        }
        for (int x : arrayMarks) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Максимальная оценка под номером: ");
        int maxMark = arrayMarks[0];
        int numberOfMark = 0;
        for (int i = 1; i < arrayMarks.length; i++) {
            if (arrayMarks[i] > maxMark) {
                maxMark = arrayMarks[i];
                numberOfMark = i;
            }
        }
        System.out.println(numberOfMark);
        // сортировка с помощью метода Math.min Math.max
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arrayMarks.length; i++) {
            min = Math.min(min, arrayMarks[i]);
        }
        System.out.println(min+" ");

        int max = Integer.MIN_VALUE;
        for(int i=0; i<arrayMarks.length; i++){
            max=Math.max(max, arrayMarks[i]);
        }
        System.out.println(max+" ");

    }
}