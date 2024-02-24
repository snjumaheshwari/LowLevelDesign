package design_principles.solid_principle.open_closed.pub_sub.bad;

import design_principles.solid_principle.open_closed.pub_sub.Event;

public class EventHandler {

    private AnalyticSubscriber analyticSubscriber;
    private LogsSubscriber logsSubscriber;

    public void handleEvent(final Event event){
        analyticSubscriber.analyze(event);
        logsSubscriber.logs(event);
    }
}
