package by.it.romankova.lesson1.lab6Strings;
/*2. Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_6_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку с текстом: ");
        String string = bufferedReader.readLine();
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(string);
        int count=0;
        while (matcher.find()){
            count++;
            System.out.print(count+"-"+matcher.group()+" ");
        }
        System.out.print("\nКоличество слов в тексте: "+count);

        bufferedReader.close();
    }
}
