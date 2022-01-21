package by.it.romankova.lesson1.lab9Collection;
/*3.Создать список оценок учеников с помощью ArryList, заполнить случайными
        оценками. Найти самую высокую оценку с использованием итератора.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            marks.add((int) (Math.random() * 10));
        }
        System.out.println(marks);
        int maxMark = 0;
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > maxMark) {
                maxMark = number;
            }
        }
        System.out.println(maxMark);
    }
}
