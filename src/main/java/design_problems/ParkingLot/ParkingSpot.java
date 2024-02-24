package design_problems.ParkingLot;

import design_problems.ParkingLot.enums.ParkingSpotType;

public abstract class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;

    ParkingSpotType type;

    public ParkingSpot(ParkingSpotType type) {
        this.type = type;
    }
    public void assignVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        isEmpty = false;
    }
    public void removeVehicle(){
        this.vehicle = null;
        isEmpty = false;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }
}

