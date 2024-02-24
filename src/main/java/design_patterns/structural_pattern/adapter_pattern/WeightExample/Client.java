package design_patterns.structural_pattern.adapter_pattern.WeightExample;
import design_patterns.structural_pattern.adapter_pattern.WeightExample.Adapter.WeightMachineAdapter;
import design_patterns.structural_pattern.adapter_pattern.WeightExample.Adapter.WeightMachineAdapterImpl;

public class Client {

    public static void main(String[] args){
        WeightMachineAdapter w = new WeightMachineAdapterImpl();
        System.out.println(w.getWeightInKg());
    }
}
