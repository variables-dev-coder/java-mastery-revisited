package day05_ObjectOrientedProgramming;

interface Payment {
    void pay();   // by default public & abstract
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Payment via UPI");
    }

    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay();
    }
}

// Payment via UPI