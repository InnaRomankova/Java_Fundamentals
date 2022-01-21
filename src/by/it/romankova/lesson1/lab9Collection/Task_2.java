package by.it.romankova.lesson1.lab9Collection;
/*2.Создать коллекцию, наполнить ее случайными числами. Удалить
        повторяющиеся числа.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        for (int i =0; i<25; i++){
            numbers.add((int)(Math.random()*10));
        }
        System.out.println(numbers);
        Set <Integer> numbers2 = new HashSet<>(numbers) ;
        System.out.println(numbers2);
    }
}
