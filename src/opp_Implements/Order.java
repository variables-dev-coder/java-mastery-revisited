package opp_Implements;

public class Order {

    private Customer customer;

    private PaymentMethod paymentMethod;

    public Order(Customer customer, PaymentMethod paymentMethod) {

        this.customer = customer;
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {

        paymentMethod.pay(amount);
    }
}
