package by.it.romankova.lesson2.object_25_test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class objtime {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date date =new Date();
        calendar.set(Calendar.DAY_OF_MONTH,10);
        calendar.set(Calendar.MONTH,11);

    }
}
