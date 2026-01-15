package revision;

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Email sent");
    }
}

class SmsNotification implements Notification {
    public void notifyUser() {
        System.out.println("SMS sent");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SmsNotification();

        n1.notifyUser();
        n2.notifyUser();
    }
}

