package abstract_revision;

interface Payment16 {

    void pay(double amount);
}

class UpiPayment16 implements Payment16 {

    @Override
    public void pay(double amount) {
        System.out.println("UPI payment: ₹" + amount);
    }
}

class CreditCardPayment implements Payment16 {

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment: ₹" + amount);
    }
}

class NetBankingPayment implements Payment16 {

    @Override
    public void pay(double amount) {
        System.out.println("Net Banking payment: ₹" + amount);
    }
}

public class Main_16 {

    public static void main(String[] args) {

        Payment16 payment;

        payment = new UpiPayment16();
        payment.pay(1000);

        payment = new CreditCardPayment();
        payment.pay(2000);

        payment = new NetBankingPayment();
        payment.pay(3000);
    }
}
