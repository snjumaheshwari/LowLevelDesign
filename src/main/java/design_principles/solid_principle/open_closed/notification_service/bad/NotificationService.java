package design_principles.solid_principle.open_closed.notification_service.bad;

import design_principles.solid_principle.open_closed.notification_service.EmailThirdParty;
import design_principles.solid_principle.open_closed.notification_service.MessageThirdParty;
import design_principles.solid_principle.open_closed.notification_service.Notification;
//import design_principles.solid_principle.open_closed.notification_service.NotificationType;

public class NotificationService {

    private EmailThirdParty emailThirdParty;
    private MessageThirdParty messageThirdParty;

//    public void sendNotification(Notification notification){
//        if(notification.getType() == NotificationType.SMS){
//            messageThirdParty.sendSMS();
//
//        }
//        else if( notification.getType() == NotificationType.EMAIL){
//            emailThirdParty.sendEmail();
//        }
//    }
}
