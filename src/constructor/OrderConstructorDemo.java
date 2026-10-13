package constructor;


class Order {

    int orderId;
    String customerName;
    String productName;
    int quantity;
    double price;
    String status;

    // 1. No-argument constructor
    Order() {
        this(0, "Unknown", "Not Selected", 1, 0.0);
        System.out.println("Default order created");
    }

    // 2. Parameterized constructor
    Order(int orderId, String customerName,
          String productName, int quantity, double price) {

        if (quantity <= 0 || price < 0) {
            throw new IllegalArgumentException(
                    "Quantity must be positive and price cannot be negative"
            );
        }

        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = "Placed";
    }

    // 3. Overloaded constructor
    Order(int orderId, String customerName, String productName) {
        this(orderId, customerName, productName, 1, 500.0);
    }

    // 4. Copy constructor
    Order(Order other) {
        this(other.orderId, other.customerName,
                other.productName, other.quantity, other.price);

        this.status = other.status;
    }

    // Calculate total price
    double calculateTotal() {
        return quantity * price;
    }

    // Cancel order
    void cancelOrder() {
        if (status.equals("Placed")) {
            status = "Cancelled";
            System.out.println("Order cancelled successfully");
        } else {
            System.out.println("Order cannot be cancelled: " + status);
        }
    }

    // Display order details
    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: Rs. " + price);
        System.out.println("Total: Rs. " + calculateTotal());
        System.out.println("Status: " + status);
        System.out.println("--------------------------");
    }
}

public class OrderConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Order o1 = new Order();
        o1.display();

        // Parameterized constructor
        Order o2 = new Order(
                101, "Munna", "Laptop", 2, 45000.0
        );
        o2.display();

        // Overloaded constructor
        Order o3 = new Order(
                102, "Rahul", "Keyboard"
        );
        o3.display();

        // Cancel an order
        o2.cancelOrder();
        o2.display();

        // Copy constructor
        Order o4 = new Order(o3);
        o4.display();
    }
}

