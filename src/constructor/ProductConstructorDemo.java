package constructor;


class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    // 1. No-argument constructor
    Product() {
        this(0, "Unknown Product", 0.0, 0);
        System.out.println("Default product created");
    }

    // 2. Parameterized constructor
    Product(int productId, String productName,
            double price, int quantity) {

        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException(
                    "Price and quantity cannot be negative"
            );
        }

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // 3. Overloaded constructor
    Product(int productId, String productName, double price) {
        this(productId, productName, price, 1);
    }

    // 4. Copy constructor
    Product(Product other) {
        this(other.productId, other.productName,
                other.price, other.quantity);
    }

    // Add stock
    void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " units added");
        } else {
            System.out.println("Invalid stock amount");
        }
    }

    // Sell stock
    void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid sale quantity");
        } else if (amount > quantity) {
            System.out.println("Insufficient stock");
        } else {
            quantity -= amount;
            System.out.println(amount + " units sold");
        }
    }

    // Calculate inventory value
    double getInventoryValue() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Inventory Value: Rs. "
                + getInventoryValue());
        System.out.println("---------------------------");
    }
}

public class ProductConstructorDemo {

    public static void main(String[] args) {

        // No-argument constructor
        Product p1 = new Product();
        p1.display();

        // Parameterized constructor
        Product p2 = new Product(101, "Laptop", 50000, 10);
        p2.display();

        // Overloaded constructor
        Product p3 = new Product(102, "Mouse", 500);
        p3.addStock(9);
        p3.sellStock(2);
        p3.display();

        // Copy constructor
        Product p4 = new Product(p2);
        p4.display();
    }
}

