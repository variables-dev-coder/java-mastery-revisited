package oppsRevision;

import java.util.*;

// 1️⃣ Strategy Interface
interface Notification {
    void send(String message);
}

// 2️⃣ Concrete Strategies
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push notification sent: " + message);
    }
}

// 3️⃣ Factory Pattern
class NotificationFactory {

    private static final Map<String, Notification> notificationMap = new HashMap<>();

    static {
        notificationMap.put("email", new EmailNotification());
        notificationMap.put("sms", new SMSNotification());
        notificationMap.put("push", new PushNotification());
    }

    public static Notification getNotification(String type) {
        Notification notification = notificationMap.get(type.toLowerCase());
        if (notification == null) {
            throw new IllegalArgumentException("Invalid notification type");
        }
        return notification;
    }
}

// 4️⃣ Observer Pattern
interface Observer {
    void update(String message);
}

class UserObserver implements Observer {

    private String type;

    public UserObserver(String type) {
        this.type = type;
    }

    @Override
    public void update(String message) {
        Notification notification = NotificationFactory.getNotification(type);
        notification.send(message);
    }
}

class EventManager {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// 5️⃣ Singleton Service (Thread-safe)
class NotificationService {

    private static volatile NotificationService instance;

    private EventManager eventManager;

    private NotificationService() {
        eventManager = new EventManager();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            synchronized (NotificationService.class) {
                if (instance == null) {
                    instance = new NotificationService();
                }
            }
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        eventManager.subscribe(observer);
    }

    public void triggerEvent(String message) {
        eventManager.notifyAllObservers(message);
    }
}

// 6️⃣ Main
public class NotificationSystem {

    public static void main(String[] args) {

        NotificationService service = NotificationService.getInstance();

        service.registerObserver(new UserObserver("email"));
        service.registerObserver(new UserObserver("sms"));
        service.registerObserver(new UserObserver("push"));

        service.triggerEvent("Order Placed Successfully!");
    }
}
