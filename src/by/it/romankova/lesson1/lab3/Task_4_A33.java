package by.it.romankova.lesson1.lab3;

import java.io.*;

public class Task_4_A33 {
    public static void main(String[] args) throws IOException {
        System.out.println("Программа выводит заданное число в банковском формате ххх ххх ххх: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        int a = Integer.parseInt(reader.readLine());

        int count = 0; //Считаем количество трехзначных блоков
        for (int i = 1; i < a; i++) {
            i = i * 1000;
            count++;
        }
        int[] bankarray; //объявляем массив куда запишем 3 значения
        bankarray = new int[count]; //инициализируем массив длиной count
        int kysok; //переменная для кусков, которые пойдут в массив
        for (int i = count - 1; i >= 0; i--) {  //присваем i знаение count-1, выполняем цикл, пока i не ситерируется до 0
            kysok = a % 1000; //делаем кусок числа
            bankarray[i] = kysok;//и пишем его в массив
            a = a / 1000; //соответственно уменьшаем исходное число
        }
        for (int i = 0; i < count; i++) //выводим значения записанные в массив, начиная с 0го, пока не сравняется с count
        {
            System.out.print((i > 0 ? (bankarray[i] / 100 < 1 ? (bankarray[i] / 10 < 1 ? "00" : "0") : "") : "") + bankarray[i] + " "); // а это чтобы числа формата 1002 и 1020 корректно работали
        }
    }
}
