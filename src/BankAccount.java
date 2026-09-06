public class BankAccount {

    // Private fields
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double startingBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        if (startingBalance >= 0) {
            this.balance = startingBalance;
        } else {
            this.balance = 0;
        }
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit. Deposit amount must be greater than zero.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal. Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Invalid withdrawal. Insufficient funds.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f%n", amount);
        }
    }

    // Return current balance
    public double getBalance() {
        return balance;
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}
