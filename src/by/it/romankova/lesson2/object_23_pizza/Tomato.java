package by.it.romankova.lesson2.object_23_pizza;

public class Tomato  implements Ingredient {
    @Override
    public int getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "fresh tomato.";
    }
}
