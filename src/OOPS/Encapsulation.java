package OOPS;

public class Encapsulation {

//    Encapsulation is the process of hiding internal object details and providing controlled access via public methods. It’s about wrapping data and behavior into one unit — the class — and restricting direct access to internal variables.
public static void main(String[] args) {

    BankAcco2 account = new BankAcco2("John Doe", "ABC12345", 10000);

    System.out.println("Account Holder: " + account.getAccountHolder());
    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Current Balance: ₹" + account.getBalance());

    account.deposit(5000);
    account.withdraw(3000);
    account.withdraw(20000); // Invalid
    account.deposit(-100);   // Invalid

    System.out.println("Final Balance: ₹" + account.getBalance());

}

}

    class BankAcco2 {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAcco2(String holder, String accNumber, double initialBalance) {
        this.accountHolder = holder;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
    }

    // Getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }
}


