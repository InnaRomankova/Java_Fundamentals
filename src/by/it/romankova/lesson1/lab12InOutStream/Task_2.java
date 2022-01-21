package by.it.romankova.lesson1.lab12InOutStream;
/*2.  Написать программу, которая создаст текстовый файл и запишет в него список
файлов (путь, имя, дата создания) из заданного каталога. */

import by.it.romankova.lesson1.packageOfUsedClasses.InputOutput;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        File file = InputOutput.createNewFile("text3.txt");
        String pathDirectory = InputOutput.readFromTheConsole("Укажите путь к каталогу: ");
        getFilesDescription(pathDirectory, file);
        System.out.println("Список файлов (путь, имя, дата создания) из заданного каталога" +
                " находится в файле: "+file.getPath());
    }

    private static void getFilesDescription(String pathDirectory, File file) {
        File directory = new File(pathDirectory);

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (File fileOfDirectory : Objects.requireNonNull(directory.listFiles())) {
                if (fileOfDirectory.isFile()) {
                    fileWriter.write(fileOfDirectory.getAbsolutePath() + "; "+fileOfDirectory.getName()+"; "+
                            new Date(fileOfDirectory.lastModified())+"\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
