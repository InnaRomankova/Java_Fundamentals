package by.it.romankova.lesson1.lab13Thread.task_1;
/*1. Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 Некоторые из них можна выдавать на руки некоторые только в читальный зал.
 Посетители могут брать одновременно по несколько книг на руки и в читальный зал.1. */


import java.util.ArrayList;
import java.util.List;

import static by.it.romankova.lesson1.lab13Thread.task_1.Service.startService;



public class Task_1 {
    static final List<Book> listOfBooks = new ArrayList<>();

    public static void main(String[] args) {
        Book book1 = new Book("book1", true, true);
        Book book2 = new Book("book2", true, true);
        Book book3 = new Book("book3", true, false);
        Book book4 = new Book("book4", true, false);

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);

        startService ("bookReader1");
        startService ("bookReader2");
        startService ("bookReader3");
        startService ("bookReader4");

    }
}
