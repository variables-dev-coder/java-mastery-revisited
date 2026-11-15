package immutable_Class;

import java.util.List;

public final class Product {

    // 1. Private final fields
    private final int productId;
    private final String productName;
    private final double price;
    private final String category;
    private final List<String> features;

    // 2. Constructor
    public Product(int productId,
                   String productName,
                   double price,
                   String category,
                   List<String> features) {

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;

        // 3. Defensive Copying
        this.features = List.copyOf(features);
    }

    // 4. Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getFeatures() {
        return features;
    }

    // 5. Display product details
    public void displayProduct() {

        System.out.println("========== PRODUCT DETAILS ==========");

        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Category     : " + category);
        System.out.println("Features     : " + features);

        System.out.println("=====================================");
    }
}
