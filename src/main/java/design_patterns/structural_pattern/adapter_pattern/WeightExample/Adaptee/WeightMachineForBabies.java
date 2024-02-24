package design_patterns.structural_pattern.adapter_pattern.WeightExample.Adaptee;

public class WeightMachineForBabies implements WeightMachine{

    @Override
    public double getWeightInPound() {
        return 100;
    }
}
