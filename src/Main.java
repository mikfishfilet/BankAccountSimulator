public class Main {
    public static void main (String[] args) {
        printWelcomeMessage();

        // Create two BankAccount objects
        BankAccount account1 = new BankAccount(
                "Dolly Parton",
                "1234567",
                1000000.00
        );
        BankAccount account2 = new BankAccount(
                "Holly Anderson",
                "3216547",
                8000.00
        );

        //Display starting account information
        printDivider();
        System.out.println("STARTING ACCOUNT INFORMATION");
        printDivider();

        account1.displayAccountInfo();
        System.out.println();
        account2.displayAccountInfo();

        //Transactions for account 1
        printDivider();
        System.out.println("ACCOUNT 1 TRANSACTIONS");
        printDivider();

        account1.deposit(300.00);
        account1.withdraw(1000.00);

        //Invalid transaction
        System.out.println();
        System.out.println("Attempting to withdrawal");
        account1.withdraw(5000.00);

        // Transactions for account 2
        printDivider();
        System.out.println("ACCOUNT 2 TRANSACTIONS");
        printDivider();

        account2.deposit(50.00);
        account2.withdraw(100.00);

        //Another invalid transaction
        System.out.println();
        System.out.println("Attempting invalid deposit");
        account2.deposit(-23.00);

        //Display final account information
        printDivider();
        System.out.println("FINAL ACCOUNT INFORMATION");

        account1.displayAccountInfo();

        System.out.println();

        account2.displayAccountInfo();

        printDivider();
        System.out.println("Thank you for banking with us!");
    }
    //Helper method
    public static void printWelcomeMessage() {
        System.out.println("----------------------------");
        System.out.println("   Welcome to the Bank App   ");
        System.out.println("----------------------------");
    }

    //Helper method
    public static void printDivider() {
        System.out.println("-----------------------");
    }

}