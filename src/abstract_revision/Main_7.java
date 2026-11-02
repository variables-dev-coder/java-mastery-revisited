package abstract_revision;

// Variables in Interfaces

interface Bank {

    double INTEREST_RATE = 7.5;
}

public class Main_7 {

    public static void main(String[] args) {

        System.out.println(Bank.INTEREST_RATE);
    }
}
