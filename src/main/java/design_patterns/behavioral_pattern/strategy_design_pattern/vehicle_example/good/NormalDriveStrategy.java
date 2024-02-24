package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class NormalDriveStrategy implements DriveStrategy{
    public void drive(){
        System.out.println("Normal drive");
    }
}
