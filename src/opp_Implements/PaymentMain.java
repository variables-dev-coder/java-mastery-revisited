package opp_Implements;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        PaymentMethod payment1 = new UpiPayment();

        PaymentMethod payment2 = new CreditCardPayment();

        PaymentMethod payment3 = new PaypalPayment();

        PaymentMethod payment4 = new ApplePayPayment();

        service.processPayment(payment1, 500);

        service.processPayment(payment2, 1000);

        service.processPayment(payment3, 2000);

        service.processPayment(payment4, 10000);
    }
}
