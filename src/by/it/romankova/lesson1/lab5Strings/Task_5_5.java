package by.it.romankova.lesson1.lab5Strings;
/*5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита,
а среди них – количество слов с равным числом гласных и согласных букв. */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int numberOfWords = scanner.nextInt();
        String [] arrayOfWords = new String[numberOfWords];

        // Записываем слова в массив.
        for (int i=0; i<numberOfWords; i++){
            System.out.print("Введите слово №" + (i+1)+": ");
            Scanner scanner1 = new Scanner(System.in);
            arrayOfWords[i]=scanner1.next();
        }
        // Находим количество слов, содержащих только символы латинского алфавита,
        // среди них – количество слов с равным числом гласных и согласных букв.
        Pattern pattern1 = Pattern.compile("[a-z,A-Z]*");
        Pattern pattern2 = Pattern.compile("[eyuioaEYUIOA]");
        int countLatin=0, counterVowel=0, counterConsonant=0, countEqual=0;

        // Во внешнем цикле находим количество слов, содержащих только символы латинского алфавита
        for (int i=0; i<arrayOfWords.length; i++){
            Matcher matcher1= pattern1.matcher(arrayOfWords[i]);
            if (matcher1.matches()){
                countLatin++;

                String string = arrayOfWords[i];
                // Во внутреннем цикле находим количество слов с равным числом гласных и согласных букв.
                for (int j=0; j<string.length(); j++){
                    String s = Character.toString(string.charAt(j));
                    Matcher matcher2 = pattern2.matcher(s);
                    if (matcher2.find()){
                        counterVowel++;
                    }
                    else counterConsonant++;
                }
                if (counterVowel==counterConsonant){
                    countEqual++;
                }
                counterVowel=0;
                counterConsonant=0;
            }
        }
        System.out.println("Количество слов, содержащих только символы латинского алфавита: "+countLatin+".");
        System.out.print("Среди них – количество слов с равным числом гласных и согласных букв: "+countEqual+".");

        scanner.close();
    }
}
