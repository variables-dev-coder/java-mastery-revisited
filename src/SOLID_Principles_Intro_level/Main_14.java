package SOLID_Principles_Intro_level;

// Dependency Inversion Principle (DIP)

// Example 1: Notification System

interface Notification {
    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email notification sent");
    }
}

class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS notification sent");
    }
}

class WhatsAppNotification implements Notification {

    @Override
    public void send() {
        System.out.println("WhatsApp notification sent");
    }
}

class NotificationService {

    private final Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public void notifyUser() {
        notification.send();
    }
}

public class Main_14 {

    public static void main(String[] args) {

        NotificationService emailService =
                new NotificationService(new EmailNotification());

        NotificationService smsService =
                new NotificationService(new SMSNotification());

        NotificationService whatsappService =
                new NotificationService(new WhatsAppNotification());

        emailService.notifyUser();
        smsService.notifyUser();
        whatsappService.notifyUser();
    }
}
