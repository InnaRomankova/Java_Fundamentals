package by.it.romankova.lesson2.object_23_pizza;

public class Ham extends PizzaIngredient {
    public Ham(Ingredient ingredient) {
        super(ingredient);
    }

    @Override
    public int getCost() {
        return super.getCost()+4;
    }

    @Override
    public String getDescription() {
        return "ham, "+super.getDescription();
    }
}
