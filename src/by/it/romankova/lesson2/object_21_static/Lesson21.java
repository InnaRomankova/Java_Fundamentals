package by.it.romankova.lesson2.object_21_static;

public class Lesson21 {
    public static void main(String[] args) {
        Human.description = "nice";
        Human.getDescription();
        Human human = new Human("Bob", 40);
        /*human.getAllField();
         */
        human.printNumberOfPoeple();
        Human.description = "bad";
        human.getAllField();
        System.out.println(Math.pow(2, 3));
        Human human1 = new Human("Tom", 35);

    }
}

class Human{
    private String name;
    private int age;
    private static int countPeople;
    public static String description;
    public static void getDescription(){
        System.out.println(description);
    }
    public Human (String name, int age){
        this.name=name;
        this.age=age;
        countPeople++;
    }
    public void printNumberOfPoeple(){
        System.out.println("Number of people is "+countPeople);
    }




    public void getAllField(){
        System.out.println(name+" "+age+" "+description);
    }
}