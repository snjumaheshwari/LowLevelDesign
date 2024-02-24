package design_patterns.structural_pattern.decorator_pattern.Toppings;

import design_patterns.structural_pattern.decorator_pattern.BasePizza;
import design_patterns.structural_pattern.decorator_pattern.ToppingsDecorator;

public class ExtraCheese extends ToppingsDecorator {
    BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }
    public int cost() {
        return pizza.cost() + 10;
    }
}

