package polymorphism;


class Bank {

    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {

    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {

    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {

    @Override
    double getInterestRate() {
        return 7.5;
    }
}

public class Main_5 {

    public static void main(String[] args) {

        Bank bank;

        bank = new SBI();
        System.out.println("SBI: " +
                bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC: " +
                bank.getInterestRate() + "%");

        bank = new ICICI();
        System.out.println("ICICI: " +
                bank.getInterestRate() + "%");
    }
}

