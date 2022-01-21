package by.it.romankova.lesson1.lab12InOutStream;
/*B1. Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой. Нагенерить(создать)
файл минимум 100мб. В репозиторий GIT не закидывать!!!!*/

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.util.Scanner;

public class Task_B1 {
    public static void main(String[] args) {
        File file = new File(InputOutput.FILE_DIRECTORY, "text.txt");

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                    (InputOutput.FILE_DIRECTORY + File.separator + "text4.txt"));

            while (scanner.hasNextLine()) {
                bufferedWriter.write(scanner.nextLine()+"\n");
            }
        scanner.close();
        bufferedWriter.close();
        } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
