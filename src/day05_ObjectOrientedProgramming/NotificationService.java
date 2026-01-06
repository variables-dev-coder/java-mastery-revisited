package day05_ObjectOrientedProgramming;

interface NotificationService {
    void notifyUser();
}

class EmailService implements NotificationService {
    public void notifyUser() {
        System.out.println("Email sent");
    }
}

class OrderService {
    private NotificationService service;

    OrderService(NotificationService service) {
        this.service = service;
    }

    void placeOrder() {
        service.notifyUser();
    }

    public static void main(String[] args) {
        NotificationService ns = new EmailService();
        OrderService os = new OrderService(ns);
        os.placeOrder();
    }
}

// Email sent

// This is exactly how Spring DI works