package design_principles.solid_principle.open_closed.pub_sub.good;

import design_principles.solid_principle.open_closed.pub_sub.Event;

public interface Subscriber {

    void process(Event event);
}
