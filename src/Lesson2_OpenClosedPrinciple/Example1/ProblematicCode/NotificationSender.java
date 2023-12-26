package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();;
            } else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}
