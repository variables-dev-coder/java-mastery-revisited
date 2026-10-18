package Encapsulation;

class Product {

    // 1. Private data members
    private int productId;
    private String productName;
    private double price;
    private int stockQuantity;

    // 2. Constructor
    public Product(int productId, String productName,
                   double price, int stockQuantity) {

        this.productId = productId;
        setProductName(productName);
        setPrice(price);
        setStockQuantity(stockQuantity);
    }

    private void setStockQuantity(int stockQuantity) {
    }

    // 3. Getter for product ID
    public int getProductId() {
        return productId;
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

    // 6. Getter for stock quantity
    public int getStockQuantity() {
        return stockQuantity;
    }

    // 7. Add stock
    public void addStock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println("Stock added successfully.");
        } else {
            System.out.println(
                    "Quantity must be greater than zero!"
            );
        }
    }

    // 8. Sell product
    public void sellProduct(int quantity) {
        if (quantity <= 0) {
            System.out.println(
                    "Selling quantity must be positive!"
            );
        } else if (quantity > stockQuantity) {
            System.out.println("Insufficient stock!");
        } else {
            stockQuantity -= quantity;
            System.out.println("Product sold successfully.");
        }
    }

    // 9. Calculate inventory value
    public double calculateInventoryValue() {
        return price * stockQuantity;
    }

    // 10. Display product information
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println(
                "Inventory Value: " + calculateInventoryValue()
        );
    }
}

public class ProductEncapsulationDemo {

    public static void main(String[] args) {

        // Create product
        Product product =
                new Product(101, "Keyboard", 800, 10);

        System.out.println("=== Initial Product ===");
        product.displayProduct();

        // Add stock
        System.out.println("\n=== Add Stock ===");
        product.addStock(5);
        System.out.println(
                "Current Stock: " + product.getStockQuantity()
        );

        // Sell products
        System.out.println("\n=== Sell Product ===");
        product.sellProduct(3);
        System.out.println(
                "Current Stock: " + product.getStockQuantity()
        );

        // Try to sell more than available
        System.out.println("\n=== Invalid Sale ===");
        product.sellProduct(50);

        // Try to set invalid price
        System.out.println("\n=== Invalid Price ===");
        product.setPrice(-100);

        // Final details
        System.out.println("\n=== Final Product ===");
        product.displayProduct();
    }
}
