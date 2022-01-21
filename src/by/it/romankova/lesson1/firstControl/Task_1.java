package by.it.romankova.lesson1.firstControl;
/*1. В данной строке найти количество цифр. Вывести количество и сумму цифр.(С клавиатуры)*/

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        String string = StringInput.stringInput();

        int digitCounter = 0;
        int sumOfDigits = 0;
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            digitCounter++;
            sumOfDigits += Integer.parseInt(matcher.group());
        }
        System.out.println("В данной строке количество цифр: " + digitCounter);
        System.out.println("Сумма цифр в данной строке: " + sumOfDigits);
    }
}
