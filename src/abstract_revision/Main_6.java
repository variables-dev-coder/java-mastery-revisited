package abstract_revision;


interface Payment {

    void pay(double amount);
}

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using UPI"
        );
    }
}

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid ₹" + amount + " using Credit Card"
        );
    }
}

public class Main_6 {

    public static void main(String[] args) {

        Payment payment;

        payment = new UpiPayment();
        payment.pay(1000);

        payment = new CardPayment();

    }
}
