package design_principles.solid_principle.open_closed.pub_sub.good;

import design_principles.solid_principle.open_closed.pub_sub.Event;

public class AnalyticSubscriber implements Subscriber{
    @Override
    public void process(Event event) {
        System.out.println(" Analysing something");
    }
}
