package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super( new SpecialDriveStrategy());
    }
}
