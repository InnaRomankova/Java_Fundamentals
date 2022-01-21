package by.it.romankova.lesson1.lab13Thread;
/*1. Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
 Некоторые из них можна выдавать на руки некоторые только в читальный зал.
 Посетители могут брать одновременно по несколько книг на руки и в читальный зал.1. */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task_example1 {
    public static List<Book> listOfBooks = new ArrayList<>();

    public static void main(String[] args) {
        Book book1 = new Book("Anna Karenina", true, true);
        Book book2 = new Book("The Great Gatsby", true, false);
        Book book3 = new Book("Catch-22", true, true);
        Book book4 = new Book("The Lord Of The Rings", true, false);
        Book book5 = new Book("Alice's Adventures In Wonderland", true, false);
        Book book6 = new Book("Ulysses", true, true);
        Book book7 = new Book("1984", true, false);
        Book book8 = new Book("Jane Eyre", true, true);
        Book book9 = new Book("Moby-Dick", true, false);
        Book book10 = new Book("One Hundred Years of Solitude", true, false);
        Book book11 = new Book("Crime And Punishment", true, true);

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        listOfBooks.add(book6);
        listOfBooks.add(book7);
        listOfBooks.add(book8);
        listOfBooks.add(book9);
        listOfBooks.add(book10);
        listOfBooks.add(book11);

        startThread("1 John Smith");
        startThread("2 Tom Black");
        startThread("3 Mary Pots");
        startThread("4 Christopher Lowe");
        startThread("5 Jessica Robertson");
        startThread("6 Florence Becker");
    }

    static void startThread(String userName) {
        Thread th = new Thread(new VisitorComes(userName));
        th.start();
    }

    enum BookStatus {
        AVAILABLE,
        AT_READING_ROOM,
        BORROWED
    }

    public static class Book {
        String name;
        boolean isAvailableAtReadingRoom;
        boolean isAvailableToBorrow;
        BookStatus status;
        String userName;

        public Book(String name, boolean isAvailableAtReadingRoom, boolean isAvailableToBorrow) {
            this.name = name;
            this.isAvailableAtReadingRoom = isAvailableAtReadingRoom;
            this.isAvailableToBorrow = isAvailableToBorrow;
            this.status = BookStatus.AVAILABLE;
        }

        public String getName() {
            return this.name;
        }

        public String getUserName() {
            return this.userName;
        }

        public void setUserName(final String userName) {
            this.userName = userName;
        }

    }

    static class VisitorComes implements Runnable {

        String userName;
        final int MIN_NUM_OF_BOOKS = 1;
        final int MAX_NUM_OF_BOOKS = 4;
        final int BORROW_TIME = 3000;
        final int TIME_TO_READ_AT_READING_ROOM = 1000;

        public VisitorComes(String userName) {
            this.userName = userName;
        }

        public void run() {
            int numOfBooks = Utils.getRandomNum(MIN_NUM_OF_BOOKS, MAX_NUM_OF_BOOKS);
            for (int i = 1; i <= numOfBooks; i++) {
                int bookIndex = Utils.getRandomBook((ArrayList) listOfBooks);
                Book thisBook = listOfBooks.get(bookIndex);


                if (thisBook.status == BookStatus.BORROWED) {
                    System.out.println("We are sorry, " + userName + ", " + thisBook.getName() +
                            " is not available. " + thisBook.getUserName() + " borrowed this book.");
                }
                if (thisBook.status == BookStatus.AT_READING_ROOM) {
                    System.out.println("We are sorry, " + userName + ", " + thisBook.getName() +
                            " is not available. " + thisBook.getUserName() + " is now reading this book at the reading room.");
                }
                if (thisBook.status == BookStatus.AVAILABLE) {
                    if (thisBook.isAvailableToBorrow == true) {
                        try {
                            synchronized (listOfBooks) {
                                borrowBook(thisBook);
                            }
                            Thread.sleep(BORROW_TIME);
                            synchronized (listOfBooks) {
                                returnBook(thisBook);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (thisBook.isAvailableAtReadingRoom == true) {
                        synchronized (listOfBooks) {
                            takeBookToReadingRoom(thisBook);
                        }
                        try {
                            Thread.sleep(TIME_TO_READ_AT_READING_ROOM);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (listOfBooks) {
                            returnBook(thisBook);
                        }
                    }
                }
            }
        }

        public void borrowBook(Book thisBook) {
            thisBook.status = BookStatus.BORROWED;
            thisBook.setUserName(userName);
            System.out.println(userName + " borrowed " + thisBook.getName() + " from the library.");
        }

        public void returnBook(Book thisBook) {
            thisBook.status = BookStatus.AVAILABLE;
            thisBook.setUserName(null);
            System.out.println(userName + " returned " + thisBook.getName() + " to the library.");
        }

        public void takeBookToReadingRoom(Book thisBook) {
            thisBook.status = BookStatus.AT_READING_ROOM;
            thisBook.setUserName(userName);
            System.out.println(userName + " is now reading " + thisBook.getName() + " at the reading room.");
        }
    }

    public static class Utils {
        public static int getRandomBook(ArrayList listOfBooks) {
            Random randomGenerator = new Random();
            int index = randomGenerator.nextInt(listOfBooks.size());
            return index;
        }

        public static int getRandomNum(int min, int max) {
            return ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }
}