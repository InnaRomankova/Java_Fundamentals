package by.it.romankova.lesson2.Test_3;
//проверка правильности ввода

import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class T_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int numberFromConsole;
        while (scanner.hasNext()){
            try {
                numberFromConsole=scanner.nextInt();
                if(numberFromConsole>0 & numberFromConsole<13){
                break;}
                else {
                    System.out.print("Invalid number! Try again: ");
                    scanner.nextLine();
                }
            }
            catch (NoSuchElementException exp){
                System.out.print("Invalid input! Try again: ");
                scanner.nextLine();
            }
        }

    }
}

