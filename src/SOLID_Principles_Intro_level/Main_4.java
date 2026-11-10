package SOLID_Principles_Intro_level;

// 2. Open/Closed Principle (OCP)

// Example 1: Payment Processing

interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment: " + amount);
    }
}

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Card payment: " + amount);
    }
}

class NetBankingPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Net Banking payment: " + amount);
    }
}

class PaymentService {

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class Main_4 {
    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        service.processPayment(new UpiPayment(), 1000);
        service.processPayment(new CardPayment(), 2000);
        service.processPayment(new NetBankingPayment(), 3000);
    }
}
