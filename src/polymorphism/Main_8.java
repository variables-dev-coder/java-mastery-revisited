package polymorphism;


class Notification {

    void send(String message) {
        System.out.println("Sending notification...");
    }
}

class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class WhatsAppNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("WhatsApp sent: " + message);
    }
}

public class Main_8 {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.send("Welcome!");

        notification = new SMSNotification();
        notification.send("Your OTP is 1234");

        notification = new WhatsAppNotification();
        notification.send("Your order is confirmed");
    }
}

