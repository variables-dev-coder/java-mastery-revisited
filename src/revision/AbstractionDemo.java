package revision;

interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(1000);
    }
}

