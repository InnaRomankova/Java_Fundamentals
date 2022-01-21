package by.it.romankova.lesson2.npackage;
//ввести число от 1 до 12. вывести название месяца, соотвт-го числу. осущесвить проверку корректности ввода чисел

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int month=0;
        while (scanner.hasNext()){
            try {
                month=scanner.nextInt();
                if(month>0 & month<13){
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

        switch (month){
            case 1:
                System.out.println("Январь");break;
            case 2:
                System.out.println("Февраль");break;
            case 3:
                System.out.println("Март");break;
            case 4:
                System.out.println("Апрель");break;
            case 5:
                System.out.println("Май");break;
            case 6:
                System.out.println("Июнь");break;
            case 7:
                System.out.println("Июль");break;
            case 8:
                System.out.println("Август");break;
            case 9:
                System.out.println("Сентябрь");break;
            case 10:
                System.out.println("Октябрь");break;
            case 11:
                System.out.println("Ноябрь");break;
            case 12:
                System.out.println("Декабрь");
                break;
        }
    }
}
