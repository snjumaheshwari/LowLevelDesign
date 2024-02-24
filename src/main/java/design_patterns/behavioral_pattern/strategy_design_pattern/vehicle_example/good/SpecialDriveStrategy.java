package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special drive");
    }
}
