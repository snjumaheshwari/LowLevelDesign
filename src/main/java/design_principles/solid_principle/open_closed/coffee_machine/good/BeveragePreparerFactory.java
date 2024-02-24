package design_principles.solid_principle.open_closed.coffee_machine.good;

import design_principles.solid_principle.open_closed.coffee_machine.BeverageType;

import java.util.Map;

public class BeveragePreparerFactory {
    Map<BeverageType, BeveragePreparer> providerMap;

    public BeveragePreparer getBeveragePreparer(final BeverageType type){
        return providerMap.get(type);
    }
}
