package design_principles.solid_principle.open_closed.pub_sub.bad;

import design_principles.solid_principle.open_closed.pub_sub.Event;

public class AnalyticSubscriber {

    public void analyze(Event event){
        System.out.println(" Analysing something");
    }
}
