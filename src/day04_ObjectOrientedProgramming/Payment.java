package day04_ObjectOrientedProgramming;


public interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    public void pay() {
        System.out.println("Paid using UPI");
    }

    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay();  // Paid using UPI
    }
}