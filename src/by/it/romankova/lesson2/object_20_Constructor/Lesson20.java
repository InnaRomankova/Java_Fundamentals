package by.it.romankova.lesson2.object_20_Constructor;

public class Lesson20 {
    public static void main(String[] args) {
        Human human = new Human("Bob", 20);

    }
}

class Human {

    private String name;

    public Human (){
        System.out.println("Привет из первого конструктора!");
            }
     public Human (String name){
         System.out.println("Привет из второго конструктора");
         this.name = name;
    }
    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name= name;
    }
}