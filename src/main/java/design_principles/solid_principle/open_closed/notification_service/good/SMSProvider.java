package design_principles.solid_principle.open_closed.notification_service.good;

import design_principles.solid_principle.open_closed.notification_service.MessageThirdParty;
import design_principles.solid_principle.open_closed.notification_service.Notification;

public class SMSProvider implements NotificationProvider {

    private MessageThirdParty client;
    @Override
    public void send(Notification notification) {
        client.sendSMS();
    }
}
