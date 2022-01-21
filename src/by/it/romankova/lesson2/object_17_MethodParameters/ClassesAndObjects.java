package by.it.romankova.lesson2.object_17_MethodParameters;


public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 50);

        Person person2 = new Person();
        String s ="Вова";
        person2.setNameAndAge(s, 20);

        person1.speak();
        person2.speak();

    }
}

class Person{
    String name;
    int age;

    void setNameAndAge (String name, int age){
        this.name = name;
        this.age = age;
    }

    int calculateYearsToRetirement(){
        int years =65 - age;
        return years;
    }

    void speak (){
        for (int i=0; i<3; i++) {
            System.out.println("Меня зовут " + name + "," + " мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }

}
