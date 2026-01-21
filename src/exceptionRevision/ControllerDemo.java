package exceptionRevision;

class OrderService {
    void placeOrder(int qty) {
        if (qty <= 0)
            throw new IllegalArgumentException("Quantity must be > 0");
    }
}

public class ControllerDemo {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        try {
            service.placeOrder(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}

