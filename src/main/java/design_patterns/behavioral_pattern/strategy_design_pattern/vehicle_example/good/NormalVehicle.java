package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDriveStrategy());
    }
}
