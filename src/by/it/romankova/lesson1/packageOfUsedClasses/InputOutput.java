package by.it.romankova.lesson1.packageOfUsedClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
    // Директория для создания файла или доступа к файлам в текущей папке
    public static final File FILE_DIRECTORY = new File( "src"+
            File.separator +"by"+
            File.separator +"it"+
            File.separator +"romankova"+
            File.separator +"lesson1"+
            File.separator +"packageOfUsedClasses");


// Метод считывает с консоли информацию, возвращает строку:
    public static String readFromTheConsole (String request) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(request);
        return scanner.nextLine();
    }
    // This method returns the string received from the console
    public static String stringInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        return reader.readLine();
    }
// Метод создает новый файл в текущей папке с указанным именем:
    public static File createNewFile (String nameFile) throws IOException {
        File file = new File(FILE_DIRECTORY, nameFile);
        final boolean newFile = file.createNewFile();
        return file;
    }

}
