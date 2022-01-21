package by.it.romankova.lesson2.object_23_pizza;

public class Cheese extends PizzaIngredient {
    public Cheese(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public int getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getDescription() {
        return "cheese, "+super.getDescription();
    }
}
