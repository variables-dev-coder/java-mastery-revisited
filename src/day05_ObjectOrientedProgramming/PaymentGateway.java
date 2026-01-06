package day05_ObjectOrientedProgramming;

interface PaymentGateway {
    void pay();
}

class FakePaymentGateway implements PaymentGateway {
    public void pay() {
        System.out.println("Fake payment for testing");
    }
}

class CheckoutService {
    private PaymentGateway gateway;

    CheckoutService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    void checkout() {
        gateway.pay();
    }

    public static void main(String[] args) {
        CheckoutService test = new CheckoutService(new FakePaymentGateway());
        test.checkout();
    }
}

// Fake payment for testing