package by.it.romankova.lesson2.object_23_pizza;

public class Pizza  extends PizzaIngredient {
    // нужно создать конструктор, который принимает ингридиент
    public Pizza (Ingredient ingredient){
        super (ingredient);
    }

    @Override
    public int getCost() {
        return super.getCost()+5;
    }

    @Override
    public String getDescription() {
        return "Pizza with "+super.getDescription();
    }
}
