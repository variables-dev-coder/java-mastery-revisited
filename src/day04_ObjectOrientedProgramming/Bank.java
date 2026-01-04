package day04_ObjectOrientedProgramming;

public class Bank {
    double rate() {
        return 5.0;
    }
}

class SBI extends Bank {
    double rate() {
        return 6.5;
    }

    public static void main(String[] args) {
        Bank b = new SBI();

        System.out.println(b.rate());   // 6.5
    }
}
