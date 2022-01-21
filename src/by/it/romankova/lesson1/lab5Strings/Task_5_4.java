package by.it.romankova.lesson1.lab5Strings;
//4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально.
// Если таких слов несколько, найти первое из них.


import java.util.Scanner;

public class Task_5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число слов: ");
        int numberOfWords = scanner.nextInt();
        String [] arrayOfWords = new String[numberOfWords];

        for (int i=0; i<arrayOfWords.length;i++){
            System.out.print("Введите слово №"+ (i+1)+ ": ");
            Scanner scanner1 = new Scanner(System.in);
            arrayOfWords[i]= scanner1.next();}
        int min=arrayOfWords[0].length();
        for(int i=1; i<arrayOfWords.length;i++){
            if (arrayOfWords[i].length()<min){
                min=arrayOfWords[i].length();
            }
        }
        for (int i=0; i<arrayOfWords.length; i++){
            if (arrayOfWords[i].length()==min){
                System.out.println("Первое из слов с количеством минимальных символов под №"+(i+1)+": "+arrayOfWords[i]);
                break;
            }
        }
        scanner.close();
    }
}

