package design_problems.ParkingLot;

import design_problems.ParkingLot.enums.AccountStatus;
import design_problems.ParkingLot.models.Person;

public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword(String password){

        // this can also be done using some other service, password checker service..
        if(password.length() < 8){
            return false;
        }
        this.password = password;
        return true;
    }
}
