package design_patterns.behavioral_pattern.strategy_design_pattern.vehicle_example.good;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    void drive(){
        driveStrategy.drive();
    }
}
