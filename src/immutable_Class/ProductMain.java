package immutable_Class;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        // Original mutable list
        List<String> features = new ArrayList<>();

        features.add("16GB RAM");
        features.add("512GB SSD");
        features.add("Intel i5 Processor");

        // Create immutable Product object
        Product product = new Product(
                101,
                "Dell Laptop",
                65000.0,
                "Electronics",
                features
        );

        // Display product details
        product.displayProduct();

        // Try modifying original list
        features.add("RTX Graphics");

        System.out.println("\nAfter modifying original list:");

        System.out.println(product.getFeatures());

        // Try modifying list through getter
        product.getFeatures().add("Touch Screen");
    }
}
