package by.it.romankova.lesson1.lab12InOutStream;
/*3.Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
Признаком окончания записи (конец работы программы) является строка со словом «#ESC».*/

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.Scanner;

public class Task_3 {
    private static final String FINISH_WRITING = "#ESC";
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                (InputOutput.FILE_DIRECTORY+ File.separator+"text4.txt"))) {
            System.out.println("Введите данные с консоли для записи в файл. " +
                    "После окончания записи введите слово «#ESC».");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputLineFromConsole;
            while (true){
                inputLineFromConsole = bufferedReader.readLine();
                if (inputLineFromConsole.equals(FINISH_WRITING)) break;
                bufferedWriter.write(inputLineFromConsole+"\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
