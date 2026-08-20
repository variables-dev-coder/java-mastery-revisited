package opp_Implements;

public class ApplePayPayment implements PaymentMethod {

    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Apple Pay");
    }
}
