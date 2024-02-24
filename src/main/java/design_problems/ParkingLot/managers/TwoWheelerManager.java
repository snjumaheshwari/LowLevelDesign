package design_problems.ParkingLot.managers;

import design_problems.ParkingLot.ParkingSpot;
import design_problems.ParkingLot.managers.ParkingSpotManager;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager {
    TwoWheelerManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }
}
