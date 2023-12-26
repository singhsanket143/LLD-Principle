package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification() {
        System.out.println("Sending SMS");
    }

    public void sendEmailNotification() {
        System.out.println("Sending Email");
    }

    public void sendWhatsappNotification() {
        System.out.println("Sending Whatsapp");
    }

}
