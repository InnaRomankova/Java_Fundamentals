package by.it.romankova.lesson1.firstControl;
/*2. Заменить каждый элемент списка с четным номером на соседний слева элемент.*/

import java.util.Arrays;
import java.util.List;

public class Task_2 {
    // This constant defines the iteration step in the loop.
    private static final int ITERATION_STEP = 2;

    public static void main(String[] args) {
        // There is a list with some elements for example.
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printList(list);

        System.out.println();

        for (int i = ITERATION_STEP; i < list.size(); i += ITERATION_STEP) {
            list.set(i, i - 1);
        }
        printList(list);
    }

    // This method prints the elements of List.
    public static void printList(List<Integer>list){
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}
