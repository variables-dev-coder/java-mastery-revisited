package immutable_Class;

import java.util.Map;

public final class Order {

    // 1. Private final fields
    private final long orderId;
    private final String customerName;
    private final String deliveryAddress;
    private final Map<String, Integer> products;
    private final double totalAmount;

    // 2. Parameterized constructor
    public Order(
            long orderId,
            String customerName,
            String deliveryAddress,
            Map<String, Integer> products,
            double totalAmount) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;

        // 3. Defensive copying
        this.products = Map.copyOf(products);

        this.totalAmount = totalAmount;
    }

    // 4. Getter methods
    public long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // 5. Calculate total number of products
    public int getTotalProducts() {

        int total = 0;

        for (int quantity : products.values()) {
            total += quantity;
        }

        return total;
    }

    // 6. Display order details
    public void displayOrder() {

        System.out.println("========== ORDER DETAILS ==========");

        System.out.println("Order ID         : " + orderId);
        System.out.println("Customer Name    : " + customerName);
        System.out.println("Delivery Address : " + deliveryAddress);

        System.out.println("\nPurchased Products:");

        for (Map.Entry<String, Integer> entry : products.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("\nTotal Products   : " + getTotalProducts());
        System.out.println("Total Amount     : ₹" + totalAmount);

        System.out.println("===================================");
    }
}
