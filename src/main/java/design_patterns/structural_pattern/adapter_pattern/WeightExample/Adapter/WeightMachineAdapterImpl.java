package design_patterns.structural_pattern.adapter_pattern.WeightExample.Adapter;

import design_patterns.structural_pattern.adapter_pattern.WeightExample.Adaptee.WeightMachine;
import design_patterns.structural_pattern.adapter_pattern.WeightExample.Adaptee.WeightMachineForBabies;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(){
        this.weightMachine = new WeightMachineForBabies();
    }
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        return weightMachine.getWeightInPound()* 0.45;
    }
}
