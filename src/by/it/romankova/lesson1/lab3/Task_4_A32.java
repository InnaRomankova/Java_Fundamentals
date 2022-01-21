package by.it.romankova.lesson1.lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_4_A32 {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //пришлось потратить часа два на разные решения, но код работает :)
        while (true) { //бесконечный цикл, нужно останавливать вручную
            System.out.print("Введите положительное целое число: ");
            String s = reader.readLine();
            int n = s.length(); //количество цифр

            System.out.print("Форматированное число: ");
            for (int i = 0; i < n; i++) {
                System.out.print(s.charAt(i));
                //здесь происходит проверка, куда ставить пробел:
                //логика следующая - находим количество цифр в числе
                //и отнимаем от этого количества остаток от деления на 3. (если число восьмизначное - отнимаем 8%3 = 2)
                //после этого при каждом делении числа без остатка на 3 ставим пробел;

                //берем порядковый номер нашего числа (прибавляем 1, т.к. нумерация с 0) ->
                //отнимаем остаток от деления на 3 - здесь ставим пробел ->
                //последняя операция %3 - каждое третье число без учета остатка
                if (((i + 1) - n % 3) % 3 == 0 && i != n - 1) System.out.print(" ");
            }
            System.out.println();
        }

        //тоже рабочее, но более длинное
        /*if (n % 3 != 0) {
            for (int i = 0; i < n % 3; i++) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }
        for (int i = n % 3; i < n; i++) {
            if ((i % 3 - n % 3) == 0 && i != n % 3) System.out.print(" ");
            System.out.print(s.charAt(i));
        }*/
    }
}
