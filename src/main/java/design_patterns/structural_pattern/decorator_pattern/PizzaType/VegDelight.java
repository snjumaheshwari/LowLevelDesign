package design_patterns.structural_pattern.decorator_pattern.PizzaType;

import design_patterns.structural_pattern.decorator_pattern.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 101;
    }
}
