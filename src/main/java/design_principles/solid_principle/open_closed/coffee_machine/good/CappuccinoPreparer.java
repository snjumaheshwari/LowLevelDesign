package design_principles.solid_principle.open_closed.coffee_machine.good;

public class CappuccinoPreparer implements BeveragePreparer{
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino");
    }
}
