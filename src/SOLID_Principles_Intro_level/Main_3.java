package SOLID_Principles_Intro_level;


// 1. Single Responsibility Principle (SRP)

// Example 3: Online Shopping Order

class Order {

    private int orderId;
    private double amount;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }
}

class OrderCalculator {

    public double calculateTax(Order order) {
        return order.getAmount() * 0.18;
    }
}

class OrderRepository {

    public void save(Order order) {
        System.out.println("Order saved: " + order.getOrderId());
    }
}

class InvoiceGenerator {

    public void generate(Order order, double tax) {
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Amount: " + order.getAmount());
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (order.getAmount() + tax));
    }
}

public class Main_3 {
    public static void main(String[] args) {

        Order order = new Order(101, 10000);

        OrderCalculator calculator = new OrderCalculator();
        OrderRepository repository = new OrderRepository();
        InvoiceGenerator invoice = new InvoiceGenerator();

        double tax = calculator.calculateTax(order);

        repository.save(order);
        invoice.generate(order, tax);
    }
}
