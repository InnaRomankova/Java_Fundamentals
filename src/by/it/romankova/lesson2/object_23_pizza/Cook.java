package by.it.romankova.lesson2.object_23_pizza;

public class Cook {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(new Ham(new Cheese(new Mushrooms(new Tomato()))));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
