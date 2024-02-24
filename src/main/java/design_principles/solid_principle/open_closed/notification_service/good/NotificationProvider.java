package design_principles.solid_principle.open_closed.notification_service.good;

import design_principles.solid_principle.open_closed.notification_service.Notification;

public interface NotificationProvider {

    public void send(Notification notification);

}
