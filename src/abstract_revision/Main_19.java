package abstract_revision;

interface Notification19 {

    void send(String message);

    default void sendNotification(String message) {

        validate(message);

        log();

        send(message);
    }

    private void validate(String message) {

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
    }

    private static void log() {
        System.out.println("Notification processing...");
    }

    static void applicationInfo() {
        System.out.println("Notification Service v1.0");
    }
}

class EmailNotification implements Notification19 {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

class SMSNotification implements Notification19 {

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}

public class Main_19 {

    public static void main(String[] args) {

        Notification19.applicationInfo();

        Notification19 email = new EmailNotification();
        email.sendNotification("Welcome!");

        Notification19 sms = new SMSNotification();
        sms.sendNotification("Your OTP is 1234");
    }
}
