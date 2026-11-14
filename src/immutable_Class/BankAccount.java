package immutable_Class;

public final class BankAccount {

    // 1. Private and final fields
    private final long accountNumber;
    private final String accountHolder;
    private final double balance;
    private final String bankName;

    // 2. Parameterized constructor
    public BankAccount(long accountNumber,
                       String accountHolder,
                       double balance,
                       String bankName) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.bankName = bankName;
    }

    // 3. Getter methods (Read-only access)
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getBankName() {
        return bankName;
    }

    // 4. Display account details
    public void displayAccountDetails() {

        System.out.println("========== BANK ACCOUNT DETAILS ==========");
        System.out.println();

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
        System.out.println("Bank Name      : " + bankName);

        System.out.println();
        System.out.println("===========================================");
    }
}
