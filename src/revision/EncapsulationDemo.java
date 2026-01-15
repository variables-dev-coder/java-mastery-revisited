package revision;

class BankAccount {
    private double balance;   // hidden data

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(5000);
        System.out.println(acc.getBalance());
    }
}

