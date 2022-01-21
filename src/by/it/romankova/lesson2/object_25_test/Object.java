package by.it.romankova.lesson2.object_25_test;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import static by.it.romankova.lesson1.packageOfUsedClasses.InputOutput.createNewFile;

public class Object {
    public static void main(String[] args) throws IOException {
        File file = createNewFile("text5.txt");
        Random random = new Random();

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i < 50; i++) {
                fileWriter.write(random.nextInt(100) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedReader((new FileReader(file))))) {
            scanner.useDelimiter("([.,!?:;)\"(]|\\s+)+");
            while (scanner.hasNext()) {
                list.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(list);
        List<Integer> result =list
                .stream()
                . distinct()
                . map(string -> Integer.valueOf(string))
                .filter(n->n>25)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
        try (FileWriter fileWriter = new FileWriter(file);) {
            for (int el:result){
                fileWriter.write(el+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
