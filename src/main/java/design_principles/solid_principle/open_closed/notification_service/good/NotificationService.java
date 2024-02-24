package design_principles.solid_principle.open_closed.notification_service.good;

import design_principles.solid_principle.open_closed.notification_service.Notification;

public class NotificationService {

    NotificationProviderFactory factory;

    public void sendNotification(Notification notification){
//        factory.getNotificationProvider(notification.getType()).send(notification);
    }

}
