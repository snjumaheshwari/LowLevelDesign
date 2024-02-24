package design_problems.ParkingLot;

import design_problems.ParkingLot.enums.VehicleType;


public abstract class Vehicle {
    String vehicle_no;
    public VehicleType type;
    private ParkingTicket ticket;
    
    public Vehicle(VehicleType type, String vehicle_no) {
        this.type = type;
        this.vehicle_no = vehicle_no;
    }
    public void assignTicket(ParkingTicket ticket) {
        this.ticket = ticket;
    }


}
