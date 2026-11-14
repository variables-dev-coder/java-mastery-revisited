package immutable_Class;


public class ImmutableClassBankAccount {

    public static void main(String[] args) {

        // 1. Create immutable object
        BankAccount account = new BankAccount(
                1234567890L,
                "Munna",
                50000.0,
                "SBI"
        );

        // 2. Display account details
        account.displayAccountDetails();

        // 3. Access individual values using getters
        System.out.println("\nIndividual Account Information:");

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: " + account.getBalance());

        // 4. Create another object with different balance
        BankAccount newAccount = new BankAccount(
                1234567890L,
                "Munna",
                60000.0,
                "SBI"
        );

        System.out.println("\nNew Account Object:");

        newAccount.displayAccountDetails();
    }
}
