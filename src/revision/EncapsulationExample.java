package revision;

class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.deposit(-500);
        System.out.println(acc.getBalance());
    }
}

