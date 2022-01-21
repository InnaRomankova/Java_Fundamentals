package by.it.romankova.lesson1.lab4Arrays.tasksArrays;
// 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Task_4_3 {
    public static void main(String[] args) {
        /* Т.к. задача стоит вывести на экран последовательность элементов не через цикл, а создав массив,
         определим количество элементов массива:*/
        int countOfElements=0;
        for (int i=90; i>=0; i-=5){
            countOfElements++;
        }
        // Заполним массив и выведем на печать:
        int [] array = new int[countOfElements];
        for (int i =0, j=90; i< array.length; i++, j-=5){
            array[i]=j;
            System.out.print(array[i]+" ");
        }
    }
}
