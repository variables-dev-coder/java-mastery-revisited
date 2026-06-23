package oppsRevision2;

interface Payment {

    void pay();
}

class UPI implements Payment {

    public void pay() {
        System.out.println("UPI Payment");
    }
}

public class Main8 {

    public static void main(String[] args) {

        Payment p = new UPI();

        p.pay();
    }
}
