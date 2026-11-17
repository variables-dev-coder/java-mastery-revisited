package immutable_Class;

import java.util.HashMap;
import java.util.Map;

public class OrderingMain {

    public static void main(String[] args) {

        // 1. Create mutable product Map
        Map<String, Integer> products = new HashMap<>();

        products.put("Laptop", 1);
        products.put("Mouse", 2);
        products.put("Keyboard", 1);
        products.put("Monitor", 1);

        // 2. Create immutable Order object
        Order order = new Order(
                1001L,
                "Munna",
                "Mumbai, Maharashtra",
                products,
                85000.00
        );

        // 3. Display order details
        order.displayOrder();

        // 4. Try modifying original Map
        products.put("Mobile", 1);

        System.out.println("\nAfter modifying original Map:");

        System.out.println(order.getProducts());

        // 5. Try modifying through getter
        order.getProducts().put("Tablet", 1);
    }
}
