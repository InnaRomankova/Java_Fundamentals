package by.it.romankova.lesson1.Lab2;
import java.util.Random;
public class Task_3_B1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(155) + 5;
        System.out.println(number);
        if ((25 <= number) & (100 >= number)){
            System.out.println("Случайно выбранное из отрезка [5;155] целое число попало в интервал [25;100]");
        }
        else System.out.println("Случайно выбранное из отрезка [5;155] целое число не попало в интервал [25;100]");
    }
}
