package design_patterns.structural_pattern.decorator_pattern.PizzaType;


import design_patterns.structural_pattern.decorator_pattern.BasePizza;

public class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 100;
    }
}
