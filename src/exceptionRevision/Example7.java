package exceptionRevision;

class InvalidBalanceException extends Exception {
    InvalidBalanceException(String msg) {
        super(msg);
    }
}

public class Example7 {
    static void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000)
            throw new InvalidBalanceException("Low balance");
    }

    public static void main(String[] args) throws Exception {
        withdraw(500);
    }
}

