package design_principles.solid_principle.open_closed.pub_sub.good;

import design_principles.solid_principle.open_closed.pub_sub.Event;
import java.util.Set;

public class EventHandler {

    Set<Subscriber> subscribers;

    public void handleEvent(final Event event){
        for(Subscriber subscriber: subscribers){
            subscriber.process(event);
        }
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
}

