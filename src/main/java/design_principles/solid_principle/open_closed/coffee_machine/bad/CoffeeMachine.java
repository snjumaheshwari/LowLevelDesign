package design_principles.solid_principle.open_closed.coffee_machine.bad;

import design_principles.solid_principle.open_closed.coffee_machine.BeverageType;

public class CoffeeMachine {

    public void prepareBeverage(BeverageType beverage){
        if(BeverageType.CAPPUCCINO == beverage){
            // prepare cappuccino
        }
        else if(BeverageType.ESPRESSO == beverage){
            // prepare Espresso
        }
    }
}
