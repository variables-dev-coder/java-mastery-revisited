package polymorphism;


class Payment7 {

    void pay(double amount) {
        System.out.println("Processing payment...");
    }
}

class UpiPayment7 extends Payment7 {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CardPayment7 extends Payment7 {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}

class NetBanking extends Payment7 {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

public class Main_7 {

    public static void main(String[] args) {

        Payment7 payment;

        payment = new UpiPayment7();
        payment.pay(1000);

        payment = new CardPayment7();
        payment.pay(2000);

        payment = new NetBanking();
        payment.pay(3000);
    }
}

