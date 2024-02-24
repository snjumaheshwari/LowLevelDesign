package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super( new SpecialDriveStrategy());
    }
}
