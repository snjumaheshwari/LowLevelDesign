package design_problems.NullObjectPattern;

public class Main {
    public static void main(String [] args){
        VehicleFactory factory = new VehicleFactory();
        Vehicle v1 = factory.getVehicle("CAR");
        Vehicle v2 = factory.getVehicle("XYZ");
        printVehicleDetails(v1);
        printVehicleDetails(v2);
    }
    public static void printVehicleDetails(Vehicle v){
        // no need to check if v!=null .. this is just an example method and can be in vehicle class as well.
        System.out.println("vehicle seating capacity is : " + v.getSeatingCapacity());
    }
}
