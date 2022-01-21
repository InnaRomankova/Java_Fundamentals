package by.it.romankova.lesson1.lab4Arrays.tasksArrays;
//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

public class Task_4_2 {
    public static void main(String[] args) {
        int [] arraySequence = new int[55];
        for (int i=0, j=1; i<arraySequence.length; i++, j+=2){
            arraySequence[i] = j;
        }
        for (int element: arraySequence){
            System.out.print(element +" ");
        }
    }
}
