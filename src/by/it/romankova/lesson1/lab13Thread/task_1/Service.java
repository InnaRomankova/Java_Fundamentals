package by.it.romankova.lesson1.lab13Thread.task_1;

import by.it.romankova.lesson1.lab13Thread.Task_example1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static by.it.romankova.lesson1.lab13Thread.task_1.Task_1.listOfBooks;

public class Service  {
    public static void startService (String bookReader){
        Thread thread = new Thread(new BookReaderService(bookReader));
        thread.start();
    }
    static class BookReaderService implements Runnable{
        String bookReader;
        final int MIN_NUM_OF_BOOKS = 1;
        final int MAX_NUM_OF_BOOKS = 3;
        final int BORROW_TIME = 20000;
        final int TIME_TO_READ_AT_READING_ROOM = 5000;


        public BookReaderService(String bookReader) {
            this.bookReader = bookReader;
        }

        public void run() {

            int numOfBooks = Utils.getRandomNum(MIN_NUM_OF_BOOKS, MAX_NUM_OF_BOOKS);
            for (int i = 1; i <= numOfBooks; i++) {
                int bookIndex = Utils.getRandomBook((ArrayList) listOfBooks);
                Book thisBook = listOfBooks.get(bookIndex);
                System.out.println (bookReader +" запрашивает книгу: "+thisBook.getBookTitle()+".");

                if (thisBook.getStatus() == BookStatus.BORROWED) {
                    System.out.println("Извините, " + bookReader + ", " + thisBook.getBookTitle() +
                            " книга в данный момент не доступна. " + thisBook.getBookReader() + " получил данную книгу на дом.");
                }
                if (thisBook.getStatus() == BookStatus.AT_READING_ROOM) {
                    System.out.println("Извините, " + bookReader + ", " + thisBook.getBookTitle() +
                            " книга в данный момент не доступна. " + thisBook.getBookReader() + " получил данную книгу для чтения в читальном зале.");
                }
                if (thisBook.getStatus() == BookStatus.AVAILABLE) {
                    if (thisBook.isAvailableToBorrow() == true) {
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
                    } else if (thisBook.isAvailableAtReadingRoom() == true) {
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
            thisBook.setBookReader(bookReader);
            System.out.println(bookReader + " получил на руки " + thisBook.getBookTitle() + ".");
        }

        public void returnBook(Book thisBook) {
            thisBook.status = BookStatus.AVAILABLE;
            thisBook.setBookReader(null);
            System.out.println(bookReader + " вернул " + thisBook.getBookTitle() + " в библиотеку.");
        }

        public void takeBookToReadingRoom(Book thisBook) {
            thisBook.status = BookStatus.AT_READING_ROOM;
            thisBook.setBookReader(bookReader);
            System.out.println(bookReader + " читает " + thisBook.getBookTitle() + " в читальном зале.");
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

