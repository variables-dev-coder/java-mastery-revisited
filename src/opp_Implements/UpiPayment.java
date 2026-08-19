package opp_Implements;

public class UpiPayment implements PaymentMethod {

    public void pay(double amount) {

        System.out.println("Paid " + amount + " using UPI");
    }
}
