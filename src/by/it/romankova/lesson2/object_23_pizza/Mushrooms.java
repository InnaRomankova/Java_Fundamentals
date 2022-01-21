package by.it.romankova.lesson2.object_23_pizza;

public class Mushrooms extends PizzaIngredient {
    public Mushrooms(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public int getCost() {
        return super.getCost()+3;
    }

    @Override
    public String getDescription() {
        return "mushrooms, "+super.getDescription();
    }
}
