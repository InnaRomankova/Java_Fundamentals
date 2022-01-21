package by.it.romankova.lesson2.object_23_pizza;

public class PizzaIngredient implements Ingredient {
    private Ingredient ingredient;
    // у класса будет конструктор, который принимает другой конструктор
    public PizzaIngredient (Ingredient ingredient){
        this.ingredient = ingredient;

    }
    @Override
    public int getCost() {
        return ingredient.getCost();
    }

    @Override
    public String getDescription() {
        return ingredient.getDescription();
    }
}
