package OOPS;

public class Abstraction {


    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount("Shubham sahu saving account", 15000);
        BankAccount account2 = new CurrentAccount("sriram current account", 5000);

       account1.printBalance();
        account1.withdraw(2000);
        account1.printBalance();
        account2.printBalance();
        account2.withdraw(1000);
        account2.printBalance();
        account2.deposit(100000);
        account2.printBalance();

        /*"A common real-world use case for an abstract
        class is a Banking System, where we define a base class BankAccount and provide common functionality
        for all types of accounts like SavingsAccount, CurrentAccount, etc.
         */


    }

}

    abstract class BankAccount {   //abstract class
        protected String accountNumber;
        protected double balance;


/*`abstract` keyword se pata chalta hai ki **ye class incomplete hai**, aur **iski direct object creation allowed nahi hai**.
- Ye ek **base class hai**, jise hum **inherit karke** `SavingsAccount`, `CurrentAccount` jaise concrete classes banate hain.
- Java mein abstract class ka use hota hai jab humein **common structure dena ho** lekin kuch behavior har child class alag implement kare.

---*/

        public BankAccount(String accountNumber, double initialBalance) {  // constructor
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        /*- Ye constructor hai. Jab koi subclass object create karega, to ye constructor **parent class ke fields initialize karega**.
- `this.accountNumber` ka matlab: instance variable ko parameter se alag dikhana.
- Example: `new SavingsAccount("SAV123", 10000)` likhne par ye constructor chalega.*/


        public abstract void withdraw(double amount);  // abstract method
    /*Ye abstract method hai, jiska koi body nahi hai (i.e., {} nahi diya gaya).

Har subclass ko apne hisaab se withdraw ka implementation dena padega.
SavingsAccount mein limit lag sakta hai.
CurrentAccount mein overdraft allow ho sakta hai.
Ye method har bank account mein zaruri hai, lekin kaise hoga woh child class define karegi.*/


        public void deposit(double amount) {  //concrete method
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        /*Ye ek **concrete method** hai — iska implementation parent class mein hi diya gaya hai.
- Jab bhi paisa deposit karna ho, to sirf balance mein add karte hain.
- Sabhi account types mein deposit same tarike se kaam karta hai, isiliye yeh yahan likha gaya hai.
*/
        public void printBalance() {   // normal method
            System.out.println("Account " + accountNumber + " Balance: " + balance);
        }

    }

class SavingsAccount extends BankAccount {
    private double withdrawalLimit = 10000;

    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Withdrawal denied: Limit or balance exceeded.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

        /*Ye method current account balance ko print karta hai.
Common functionality hai, isiliye parent class mein hi define kiya gaya.
Har child class isse directly use kar sakti hai — code reuse hota hai.*/
