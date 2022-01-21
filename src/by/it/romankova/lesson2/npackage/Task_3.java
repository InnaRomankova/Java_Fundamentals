package by.it.romankova.lesson2.npackage;
//создать и заполнить файл случайными целыми значениями. удалить все нечетные. выполнить сортировку по возрастанию,
// вывести в другой файл

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        File file = InputOutput.createNewFile("text5.txt");
        File file1 = InputOutput.createNewFile("text6.txt");
        Random random = new Random();
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i < 11; i++) {
                fileWriter.write(random.nextInt(100) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader((new FileReader(file))))) {
            scanner.useDelimiter(" ");
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        List<Integer> list1 = list
                .stream()
                .filter(num -> num % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list1);
        try (FileWriter fileWriter = new FileWriter(file1)) {
            for (int el : list1) {
                fileWriter.write(el + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
