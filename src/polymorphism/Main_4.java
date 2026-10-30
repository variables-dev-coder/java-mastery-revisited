package polymorphism;


interface Payment {

    void pay(double amount);
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class PaymentService {

    void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class Main_4 {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        Payment upi = new UpiPayment();
        service.processPayment(upi, 1000);

        Payment card = new CardPayment();
        service.processPayment(card, 2000);
    }
}

