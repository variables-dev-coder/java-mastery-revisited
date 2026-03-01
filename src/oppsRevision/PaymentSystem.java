package oppsRevision;

import java.util.*;

// 1️⃣ Abstraction via Interface
interface Payment {
    void validate() throws Exception;
    void process() throws Exception;
}

// 2️⃣ Abstract Class with Common Logic
abstract class AbstractPayment implements Payment {

    protected double amount;

    public AbstractPayment(double amount) {
        this.amount = amount;
    }

    protected void checkAmount() throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid payment amount.");
        }
    }
}

// 3️⃣ Concrete Implementation - Credit Card
class CreditCardPayment extends AbstractPayment {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void validate() throws Exception {
        checkAmount();
        if (cardNumber.length() != 16) {
            throw new Exception("Invalid card number.");
        }
    }

    @Override
    public void process() {
        System.out.println("Processing Credit Card Payment of ₹" + amount);
    }
}

// 4️⃣ Concrete Implementation - UPI
class UPIPayment extends AbstractPayment {

    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void validate() throws Exception {
        checkAmount();
        if (!upiId.contains("@")) {
            throw new Exception("Invalid UPI ID.");
        }
    }

    @Override
    public void process() {
        System.out.println("Processing UPI Payment of ₹" + amount);
    }
}

// 5️⃣ Payment Processor (Composition + Polymorphism)
class PaymentProcessor {

    private Payment payment;

    // Dependency Injection
    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void execute() {
        try {
            payment.validate();
            payment.process();
            System.out.println("Payment Successful.");
        } catch (Exception e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }
}

// 6️⃣ Main Class
public class PaymentSystem {

    public static void main(String[] args) {

        Payment credit = new CreditCardPayment(5000, "1234567812345678");
        Payment upi = new UPIPayment(2000, "munna@upi");

        PaymentProcessor processor1 = new PaymentProcessor(credit);
        PaymentProcessor processor2 = new PaymentProcessor(upi);

        processor1.execute();
        processor2.execute();
    }
}
