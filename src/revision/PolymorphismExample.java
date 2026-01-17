package revision;

class Payment1 {
    void pay() {
        System.out.println("Generic payment");
    }
}

class CardPayment1 extends Payment1 {
    void pay() {
        System.out.println("Paid using Card");
    }
}

class UpiPayment1 extends Payment1 {
    void pay() {
        System.out.println("Paid using UPI");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Payment1 p1 = new CardPayment1();
        Payment1 p2 = new UpiPayment1();

        p1.pay();
        p2.pay();
    }
}

