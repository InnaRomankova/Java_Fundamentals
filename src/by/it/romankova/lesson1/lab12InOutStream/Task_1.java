package by.it.romankova.lesson1.lab12InOutStream;
/*1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел. Закрыть поток ввода-вывода.*/

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        // src\by\it\romankova\lesson1\packageOfUsedClasses\text2.txt
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream
                (InputOutput.readFromTheConsole("Введите путь к файлу : ")))) {
            outputMaxFrequencyOfBytes(toHashMapOfBytes(bufferedInputStream));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
// В HashMap в качестве ключа помещаем байт, в качестве значения - количество экземпляров байт
    private static HashMap<Integer, Integer> toHashMapOfBytes(BufferedInputStream bufferedInputStream) {
        HashMap<Integer, Integer> hashMapOfBytes = new HashMap<>();
        int key=0;
        while (true) {
            try {
                if ((key = bufferedInputStream.read()) == -1) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            Integer frequencyOfBytes = hashMapOfBytes.get(key);
            hashMapOfBytes.put(key, frequencyOfBytes==null?1:frequencyOfBytes+1);
        }
        System.out.println(hashMapOfBytes);
        return hashMapOfBytes;
    }

// Метод outputMaxFrequencyOfBytes выводит на печать байты с максимальным количеством повторов.
    private static void outputMaxFrequencyOfBytes(HashMap<Integer, Integer> hashMapOfBytes) {
        System.out.print("Байт (байты) с максимальным количеством повторов:");
        hashMapOfBytes.forEach((key, value) -> {if (value == Collections.max(hashMapOfBytes.values()))
            System.out.print(" " + key);});
        System.out.println(". Количество повторов: "+ Collections.max(hashMapOfBytes.values())+".");
    }
}
