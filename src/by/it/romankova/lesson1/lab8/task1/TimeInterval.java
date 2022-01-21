package by.it.romankova.lesson1.lab8.task1;

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }
    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public int getSeconds() {
        return seconds;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getHours() {
        return hours;
    }

    static final int CONST_UNITS = 60;
    public int timeIntervalInSeconds (){
        return (hours*CONST_UNITS*CONST_UNITS + minutes*CONST_UNITS+seconds);
    }
   public void compareTimeInterval(TimeInterval compareTo) {
       System.out.println("Первый промежуток времени: "+this.getSeconds()+" сек. " +
               "\nВторой промежуток времени: "+compareTo.getHours()+" ч "+compareTo.getMinutes()+" мин "
               +compareTo.getSeconds()+" сек, или при пересчете в секунды - "+compareTo.timeIntervalInSeconds()+" сек. " +
               "\nРазница между промежутками времени " + Math.abs(this.getSeconds() - compareTo.timeIntervalInSeconds()) + " сек.");
        if (this.getSeconds() > compareTo.timeIntervalInSeconds()) {
            System.out.println("Первый промежуток времени больше второго.");}
        else if (this.getSeconds() < compareTo.timeIntervalInSeconds()) {
            System.out.println("Второй промежуток времени больше первого."); }
        else System.out.println("Промежутки времени равны.");
    }




}
