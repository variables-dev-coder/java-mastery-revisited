package oppsRevision2;

abstract class Payment17 {

    abstract void pay17();

    void printReceipt17() {
        System.out.println("Receipt Printed");
    }
}

class UPI17 extends Payment17 {

    void pay17() {
        System.out.println("UPI Payment");
    }
}

public class Main17 {

    public static void main(String[] args) {

        Payment17 payment = new UPI17();

        payment.pay17();
        payment.printReceipt17();
    }
}
