package by.it.romankova.lesson1.lab9Collection;
/*1. Создать список оценок учеников с помощью ArrayList, заполнить
        случайными оценками. Удалить неудовлетворительные оценки из списка.*/

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            marks.add(random.nextInt(11));
        }
        System.out.println(marks);
        marks.removeIf(mark -> mark < 4);
        /*ListIterator<Integer> iterator = marks.listIterator();
        while (iterator.hasNext()) {
            int mark = iterator.next();
            if (mark < 4) {
                iterator.remove();
            }
        }*/
        System.out.println(marks);

    }
}
