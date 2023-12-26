package Lesson2_OpenClosedPrinciple.Example1.BetterCode;

import Lesson2_OpenClosedPrinciple.Example1.ProblematicCode.NotificationType;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<Notification> notifications) {
        for(Notification notification : notifications) {
            notification.send();
        }
    }
}
