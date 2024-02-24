package design_principles.solid_principle.open_closed.pub_sub.bad;

import design_principles.solid_principle.open_closed.pub_sub.Event;

public class LogsSubscriber {

    public void logs(Event event){
        System.out.println("Logging something");
    }
}
