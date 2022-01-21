package by.it.romankova.lesson2.object_18_Encapsulation;
// API Application Public Interface
public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.setAge(20);

        System.out.println(person1.getName()+" "+person1.getAge());

    }
}

class Person{
    private String name;
    private int age;

    public void setName (String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пусток имя");
        } else {
            this.name = name;
        }}
        public String getName () {
            return name;
        }
    public void setAge (int age){
        if (age<0){
            System.out.println("Возраст должен быть положительным");
        } else {this.age=age;}
    }
    int getAge (){
        return age;
    }


        int calculateYearsToRetirement () {
            int years = 65 - age;
            return years;
        }

        void speak () {
            for (int i = 0; i < 3; i++) {
                System.out.println("Меня зовут " + name + "," + " мне " + age + " лет");
            }
        }
        void sayHello () {
            System.out.println("Привет!");
        }

}
