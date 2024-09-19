package ajp;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f. New balance: $%.2f.%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Withdrew: $%.2f. New balance: $%.2f.%n", amount, balance);
            } else {
                System.out.println("Insufficient funds for this withdrawal.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder: " + accountHolderName + "\n" +
               "Balance: $" + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        // Create a bank account
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);

        // Print account details
        System.out.println(account1);

        // Simulate transactions
        account1.deposit(250.0);
        account1.withdraw(100.0);
        account1.withdraw(1200.0);  // Should show insufficient funds
        account1.deposit(-50.0);     // Should show invalid deposit
        account1.withdraw(-25.0);    // Should show invalid withdrawal

        // Check final balance
        System.out.printf("Final Balance: $%.2f%n", account1.getBalance());
    }
}
