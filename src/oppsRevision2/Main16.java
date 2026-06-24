package oppsRevision2;

interface Notification {

    void send();
}

class EmailNotification
        implements Notification {

    public void send() {
        System.out.println("Email Sent");
    }
}

class SmsNotification
        implements Notification {

    public void send() {
        System.out.println("SMS Sent");
    }
}

public class Main16 {

    public static void main(String[] args) {

        Notification n1 = new EmailNotification();

        Notification n2 = new SmsNotification();

        n1.send();
        n2.send();
    }
}
