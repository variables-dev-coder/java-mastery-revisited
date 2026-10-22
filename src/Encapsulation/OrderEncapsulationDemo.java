package Encapsulation;


class Order {

    // 1. Private data members
    private int orderId;
    private String productName;
    private double price;
    private int quantity;
    private String status;

    // 2. Constructor
    public Order(int orderId, String productName,
                 double price, int quantity) {

        this.orderId = orderId;
        setProductName(productName);
        setPrice(price);
        setQuantity(quantity);

        this.status = "PLACED";
    }

    // 3. Getter for order ID
    public int getOrderId() {
        return orderId;
    }

    // 4. Getter and setter for product name
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName != null && !productName.isBlank()) {
            this.productName = productName;
        } else {
            System.out.println("Invalid product name!");
        }
    }

    // 5. Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive!");
        }
    }

    // 6. Getter and setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            System.out.println(
                    "Quantity must be greater than zero!"
            );
        }
    }

    // 7. Calculate total amount
    public double calculateTotal() {
        return price * quantity;
    }

    // 8. Cancel order
    public void cancelOrder() {
        if (status.equals("PLACED")) {
            status = "CANCELLED";
            System.out.println("Order cancelled successfully.");
        } else {
            System.out.println(
                    "Only placed orders can be cancelled."
            );
        }
    }

    // 9. Ship order
    public void shipOrder() {
        if (status.equals("PLACED")) {
            status = "SHIPPED";
            System.out.println("Order shipped successfully.");
        } else {
            System.out.println(
                    "Only placed orders can be shipped."
            );
        }
    }

    // 10. Getter for status
    public String getStatus() {
        return status;
    }

    // 11. Display order details
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Status: " + status);
    }
}

public class OrderEncapsulationDemo {

    public static void main(String[] args) {

        // Create order
        Order order = new Order(
                1001, "Laptop", 50000, 2
        );

        System.out.println("=== Initial Order ===");
        order.displayOrder();

        // Update quantity
        System.out.println("\n=== Update Quantity ===");
        order.setQuantity(3);
        System.out.println(
                "Updated Total: " + order.calculateTotal()
        );

        // Try invalid quantity
        System.out.println("\n=== Invalid Quantity ===");
        order.setQuantity(-5);
        System.out.println(
                "Current Quantity: " + order.getQuantity()
        );

        // Ship order
        System.out.println("\n=== Ship Order ===");
        order.shipOrder();

        // Try cancelling a shipped order
        System.out.println("\n=== Cancel Shipped Order ===");
        order.cancelOrder();

        // Final details
        System.out.println("\n=== Final Order ===");
        order.displayOrder();
    }
}

