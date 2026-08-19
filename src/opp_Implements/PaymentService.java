package opp_Implements;

public class PaymentService {

    public void processPayment(PaymentMethod paymentMethod, double amount) {

        paymentMethod.pay(amount);
    }
}
