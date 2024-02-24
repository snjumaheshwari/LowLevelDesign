package design_problems.NullObjectPattern;

public class VehicleFactory {

    Vehicle getVehicle(String type){
        if(type == "CAR"){
            return new Car();
        }
        return new NullObject();
    }
}
