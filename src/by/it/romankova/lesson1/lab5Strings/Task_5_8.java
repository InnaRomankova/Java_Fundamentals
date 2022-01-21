package by.it.romankova.lesson1.lab5Strings;
//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5_8 {
    @SuppressWarnings("PointlessBooleanExpression")
    public static void main(String[] args) {

        // Создаем массив слов
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int numberOfWords = scanner.nextInt();
        String [] arrayOfWords = new String[numberOfWords];

        for (int i=0; i<numberOfWords; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите слово №"+(i+1)+": ");
            arrayOfWords[i]=scanner1.next();
        }

        // Находим среди слов, состоящих только из цифр, слова-палиндромы и помещаем их в новый массив
        List <String> arrayOfPalindromeWords = new ArrayList<>();
        Pattern pattern = Pattern.compile("^[\\d]+$");
        for (int i=0; i<numberOfWords; i++){
            Matcher matcher=pattern.matcher(arrayOfWords[i]);
            boolean condition=true;
            if (matcher.matches() & arrayOfWords[i].length()>1){
                for (int j=0, t=arrayOfWords[i].length()-1; j<arrayOfWords[i].length()/2; j++, t--){
                    if(arrayOfWords[i].charAt(j) != arrayOfWords[i].charAt(t)){

                        condition = false;
                        break;
                    }
                }
                if (condition==true){
                    arrayOfPalindromeWords.add(arrayOfWords[i]);
                }
            }
        }

        if(arrayOfPalindromeWords.size()>1) {
            System.out.println("Второе по счету слово из слов-палиндромов, " +
                    "состоящих только из цифр: "+arrayOfPalindromeWords.get(1));
        } else {
            System.out.println("В данном случае нет варианта, соответствующего условию.");
        }
        scanner.close();
    }
}
