package design_principles.solid_principle.open_closed.coffee_machine.good;

import design_principles.solid_principle.open_closed.coffee_machine.BeverageType;

public class CoffeeMachine {
    BeveragePreparerFactory factory;

    public void prepareBeverage(BeverageType beverage){
            factory.getBeveragePreparer(beverage).prepare();
    }
}
