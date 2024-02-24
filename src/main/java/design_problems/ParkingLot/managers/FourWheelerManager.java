package design_problems.ParkingLot.managers;

import design_problems.ParkingLot.ParkingSpot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    FourWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }
}
