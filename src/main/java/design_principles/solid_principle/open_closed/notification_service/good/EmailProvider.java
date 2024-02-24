package design_principles.solid_principle.open_closed.notification_service.good;

import design_principles.solid_principle.open_closed.notification_service.EmailThirdParty;
import design_principles.solid_principle.open_closed.notification_service.Notification;

public class EmailProvider implements NotificationProvider{

    EmailThirdParty client;

    @Override
    public void send(Notification notification) {
        client.sendEmail();
    }
}
