package by.it.romankova.lesson1.lab10LambdaStream;
/*4*.Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Task_4 {
    private static final File FILE_DIRECTORY = new File("src" + File.separator + "by" + File.separator + "it"
            + File.separator + "romankova" + File.separator + "lesson1" + File.separator + "lab10LambdaStream");

    public static void main(String[] args) {
        File file = new File(FILE_DIRECTORY, "text.txt");

        try (Scanner scanner = new Scanner(new BufferedReader((new FileReader(file))))) {
            scanner.useDelimiter("([.,!?:;)\"(]|\\s+)+");
            int counterWordWorld = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println(word);
                if (word.equals("world")) {
                    counterWordWorld++;
                }
            }
            System.out.println("Количество слов \"world\", которые встречаются в файле text.txt: " + counterWordWorld);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
