package by.it.romankova.lesson2.object_24_InputOutputStreams;
// Создать и заполнить файл случайными целыми значениями. Удалить все нечетные.
// Выполнить сортировку содержимого по возрастанию и вывести в другой файл (output)


import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws IOException {
        File file = InputOutput.createNewFile("text10.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            Random random = new Random();
            for (int i = 0; i < 30; i++) {
                bufferedWriter.write(random.nextInt(30) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> result =new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
             result = list
                    .stream()
                    .filter(integer -> (integer % 2) == 0)
                    .sorted((o1, o2) -> o1 - o2)
                    .collect(Collectors.toList());

            for (int el : result) {
                System.out.print(el + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file1 = InputOutput.createNewFile("text11.txt");
        try (BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file1))) {
            for (int el : result) {
                bufferedWriter1.write(el + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
