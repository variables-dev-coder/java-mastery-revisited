package day04_ObjectOrientedProgramming;

public class Account {
    private double balance;

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(5000);

        System.out.println(a.getBalance());  // 5000.0
    }
}
