package by.it.romankova.lesson2.object_22_LambdaStreamAPI;
// Stream. default- метод с реализацией внутри интерфейса.

import java.util.Arrays;
import java.util.List;

public class lambda5__________ {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("12345", "123", "1234", "12");
        Integer result = strings
                .stream() // создаем поток
                .filter(string -> string.length()> 2) // фильтруем, оставляя только строки длиной больше 2
                . map(string -> string+string) // метод map преобразовывает каждый элемент стрима во что-то другое
                . map(string -> Integer.valueOf(string))// получаем из строк числа, дальше по стриму идут числа
                . map(number -> number*2) // умножаем наши числа на два
                . reduce(0, (acc, number)->number+acc); // теперь получаем сумму наших чисел в потоке
                              // 0 - это первый параметр, принимает значение result перед выполнением
                              // второй параметр - это lambda, у которой acc-аккумулятор, number-текущее число
                 // . reduce(1, (acc, number)->number*acc); // вариант с умножением
                  //
        // .forEach(string -> System.out.println(string)); выводим на печать

        System.out.println(result);


    }
}
