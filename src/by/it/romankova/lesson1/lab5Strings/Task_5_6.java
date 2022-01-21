package by.it.romankova.lesson1.lab5Strings;
/*6. Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов.
 Если таких слов несколько, найти первое из них.*/


import java.util.Scanner;

public class Task_5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int numberOfWords = scanner.nextInt();

        // Записываем слова в массив.
        String [] arrayOfWords = new String[numberOfWords];
        for (int i=0; i<numberOfWords; i++){
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Введите слово №"+ (i+1)+(": "));
            arrayOfWords[i]= scanner1.next();
        }

        // Находим первое из слов, символы в котором идут в стро-гом порядке возрастания их кодов.
        for (int i=0; i<numberOfWords; i++){

            int count=0;
            for (int j=0; j<arrayOfWords[i].length()-1; j++){
                if ((int) arrayOfWords[i].charAt(j+1)>(int) arrayOfWords[i].charAt(j)){
                    count++;
                }
            }
            if (count == arrayOfWords[i].length()-1){
                System.out.print("\nВ слове "+ arrayOfWords[i]+" символы идут в строгом порядке возрастания их кодов:");
                System.out.println();
                for (int j=0; j<arrayOfWords[i].length(); j++){
                    System.out.print((int) arrayOfWords[i].charAt(j)+ " ");
                }
                break;
            }

        }
        scanner.close();
    }
}
