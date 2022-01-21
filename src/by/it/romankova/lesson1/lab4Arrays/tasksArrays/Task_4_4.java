package by.it.romankova.lesson1.lab4Arrays.tasksArrays;
//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Task_4_4 {
    public static void main(String[] args) {
        int [] array = new int[20];
        for (int i=0, j=2; i<array.length;i++,j*=2){
            array[i]=j;
            System.out.print(array[i]+" ");
        }
    }
}
