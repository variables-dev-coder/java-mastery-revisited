package oppsRevision;

import java.util.*;

// 1️⃣ Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// 2️⃣ Concrete Strategies
class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
    }
}

class UPIStrategy implements PaymentStrategy {

    private String upiId;

    public UPIStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI: " + upiId);
    }
}

class CryptoStrategy implements PaymentStrategy {

    private String walletAddress;

    public CryptoStrategy(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Crypto Wallet: " + walletAddress);
    }
}

// 3️⃣ Factory Pattern
class PaymentFactory {

    public static PaymentStrategy getPaymentMethod(String type, String detail) {

        switch (type.toLowerCase()) {
            case "credit":
                return new CreditCardStrategy(detail);
            case "upi":
                return new UPIStrategy(detail);
            case "crypto":
                return new CryptoStrategy(detail);
            default:
                throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}

// 4️⃣ Service Layer
class PaymentService {

    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        strategy.pay(amount);
        System.out.println("Payment processed successfully.");
    }
}

// 5️⃣ Main Class
public class AdvancedPaymentSystem {

    public static void main(String[] args) {

        PaymentStrategy strategy1 =
                PaymentFactory.getPaymentMethod("credit", "1234567812345678");

        PaymentService service1 = new PaymentService(strategy1);
        service1.processPayment(5000);

        PaymentStrategy strategy2 =
                PaymentFactory.getPaymentMethod("upi", "munna@upi");

        PaymentService service2 = new PaymentService(strategy2);
        service2.processPayment(2000);
    }
}
