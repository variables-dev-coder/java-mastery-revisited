package abstract_revision;

interface Notification {

    default void sendEmail() {

        validate();

        System.out.println("Email sent");
    }

    default void sendSMS() {

        validate();

        System.out.println("SMS sent");
    }

    private void validate() {

        System.out.println("Validating notification...");
    }
}

public class Main_10 {

    public static void main(String[] args) {

        Notification notification = new Notification() {};

        notification.sendEmail();

        notification.sendSMS();
    }
}
