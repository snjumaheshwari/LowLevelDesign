package design_patterns.structural_pattern.decorator_pattern;

import design_patterns.structural_pattern.decorator_pattern.PizzaType.Margarita;
import design_patterns.structural_pattern.decorator_pattern.Toppings.ExtraCheese;
import design_patterns.structural_pattern.decorator_pattern.Toppings.Mushroom;

public class Main {

    public static void main(String args[]){

        BasePizza pizza = new ExtraCheese(new Margarita());
        System.out.println(pizza.cost());

        // margarita + extra cheese + mushroom
        BasePizza pizza_1 = new Mushroom(new ExtraCheese(new Margarita()));
        System.out.println(pizza_1.cost());
    }
}
