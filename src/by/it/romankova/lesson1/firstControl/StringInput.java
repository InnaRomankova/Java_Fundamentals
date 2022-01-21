package by.it.romankova.lesson1.firstControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInput {
    // This method returns the string received from the console.
    public static String stringInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите текст: ");
        return reader.readLine();
    }
}
