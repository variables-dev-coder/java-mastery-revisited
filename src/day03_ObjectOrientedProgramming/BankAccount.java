package day03_ObjectOrientedProgramming;

public class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(-600);
        System.out.println(acc.getBalance());
    }
}


// 5000.0

//Key Rule
//Data hidden
//Controlled access