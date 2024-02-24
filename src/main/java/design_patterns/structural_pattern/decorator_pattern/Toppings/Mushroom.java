package design_patterns.structural_pattern.decorator_pattern.Toppings;

import design_patterns.structural_pattern.decorator_pattern.BasePizza;
import design_patterns.structural_pattern.decorator_pattern.ToppingsDecorator;

public class Mushroom extends ToppingsDecorator {

    BasePizza pizza;
    @Override
    public int cost() {
        return pizza.cost() + 20;
    }

    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }
}
