package opp_Implements;

public class OrderMain {

    public static void main(String[] args) {

        Customer customer = new Customer();

        PaymentMethod payment = new UpiPayment();

        Order order = new Order(customer, payment);

        order.checkout(1500);
    }
}
