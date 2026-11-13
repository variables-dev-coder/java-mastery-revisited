package SOLID_Principles_Intro_level;

// Dependency Inversion Principle (DIP)

// Example 3: Payment Gateway

interface PaymentGateway {
    void processPayment(double amount);
}

class StripeGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe payment: " + amount);
    }
}

class RazorpayGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Razorpay payment: " + amount);
    }
}

class PayPalGateway implements PaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment: " + amount);
    }
}

class OrderService {

    private final PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        paymentGateway.processPayment(amount);
    }
}

public class Main_16 {

    public static void main(String[] args) {

        OrderService stripe =
                new OrderService(new StripeGateway());

        OrderService razorpay =
                new OrderService(new RazorpayGateway());

        OrderService paypal =
                new OrderService(new PayPalGateway());

        stripe.checkout(5000);
        razorpay.checkout(3000);
        paypal.checkout(2000);
    }
}
