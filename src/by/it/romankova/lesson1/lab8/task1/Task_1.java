package by.it.romankova.lesson1.lab8.task1;

/*1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
        в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        Сделать методы для получения полного количества секунд в объекте, сравнения
        двух обектов (метод должен работать аналогично compareTo в строках). Создать
        два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.*/

public class Task_1 {
    public static void main(String[] args) {
        TimeInterval timeInterval1 = new TimeInterval(11900);
        TimeInterval timeInterval2 = new TimeInterval(16, 25,9);
        timeInterval1.compareTimeInterval(timeInterval2);

    }
}
