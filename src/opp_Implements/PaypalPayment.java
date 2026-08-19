package opp_Implements;

public class PaypalPayment  implements PaymentMethod{

    public void pay(double amount) {

        System.out.println("Paid " + amount + " using Paypal");
    }
}
