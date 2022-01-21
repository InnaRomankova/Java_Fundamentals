package by.it.romankova.lesson1.lab5Strings;
// 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.


import java.util.Scanner;

public class Task_5_1 {
    public static void main(String[] args) {
        // Создаем массив, который будет состоять из строк.
        System.out.print("Введите число строк: ");
        Scanner sc = new Scanner(System.in);
        String [] array = new String[sc.nextInt()];
        // Заполним массив строками
        for (int i=0; i<array.length; i++){
            System.out.print("Введите строку № "+ (i+1)+": ");
            Scanner sc1 = new Scanner(System.in);
            array [i]= sc1.nextLine();
        }
        // Находим длину самых коротких и самых длинных строк.
        int min = array[0].length();
        int max = array[0].length();
        for (int i=0; i<array.length; i++){
            if (array[i].length()<min){
                min=array[i].length();
            }
            if (array[i].length()>max){
                max=array[i].length();
            }
        }
        // Выводим найденные строки и их длину.
        System.out.println("Длина самой короткой строки: "+min+". Самая короткая строка находится под №:");
        for (int i=0; i<array.length;i++){
            if (array[i].length()==min){
                System.out.println("№" + (i+1)+": " + array[i]);
            }
        }
        System.out.println("Длина самой длинной строки: "+max+". Самая длинная строка находится под №:");
        for (int i=0; i<array.length;i++){
            if (array[i].length()==max){
                System.out.println("№" + (i+1)+": " + array[i]);
            }
        }
        sc.close();
    }
}
