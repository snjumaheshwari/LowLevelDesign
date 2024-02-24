package design_problems.ParkingLot.managers;

import design_problems.ParkingLot.ParkingSpot;
import design_problems.ParkingLot.Vehicle;
import design_problems.ParkingLot.enums.VehicleType;

import java.util.List;

public class ParkingSpotManager {

    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList){
        this.parkingSpotList = parkingSpotList;
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType){

        return null;
    }

    void parkVehicle(Vehicle vehicle){
        ParkingSpot spot = findParkingSpace(vehicle.type);
        spot.assignVehicle(vehicle);
    }
    void removeVehicle(ParkingSpot spot){
        spot.removeVehicle();
    }

    // admin
    void addParkingSpace(List<ParkingSpot> spots){
        this.parkingSpotList.addAll(spots);
    }
    void removeParkingSpace(List<ParkingSpot> spots){
        this.parkingSpotList.removeAll(spots);
    }
}
