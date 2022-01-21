package by.it.romankova.lesson1.lab9Collection;
/*4.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. Напишите еще один метод,
который выбирает из заполненного списка элемент наугад 10000 раз. Замерьте время, которое потрачено на это.
Сравните результаты и предположите, почему они именно такие.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_4 {
    private static final int LIST_SIZE = 1000000;
    private static final int NUMBER_OF_ITEMS_SELECTED = 10000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(i);
        }
        System.out.println("Время добавления 1000000 элементов в ArrayList: " + (System.currentTimeMillis() - start)
                + " мс.");

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            linkedList.add(i);
        }
        System.out.println("Время добавления 1000000 элементов в LinkedList: " + (System.currentTimeMillis() - start)
                + " мс.");

        Random random = new Random();

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_ITEMS_SELECTED; i++) {
            int sample = random.nextInt(LIST_SIZE);
            arrayList.get(sample);
        }
        System.out.println("Время выборки из заполненного списка ArrayList элемента наугад 10000 раз: "
                + (System.currentTimeMillis() - start) + " мс.");

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < NUMBER_OF_ITEMS_SELECTED; i++) {
            int sample = random.nextInt(LIST_SIZE);
            linkedList.get(sample);
        }
        System.out.println("Время выборки из заполненного списка LinkedList элемента наугад 10000 раз: "
                + (System.currentTimeMillis() - start) + " мс.");


    }
}
