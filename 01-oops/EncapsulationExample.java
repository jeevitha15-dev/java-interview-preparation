/*
What is Encapsulation?
    Encapsulation is the process of bundling data and the methods that operate on that data inside a class, while restricting direct access to the data.

    In Java, we commonly achieve this using:
    private variables
        +
    public getters/setters
        +
    validation/business rules

Why did you make balance private instead of public ?
    I make balance private to prevent direct access and uncontrolled modification from outside the BankAccount class. I expose controlled access through methods such
    as getters, setters, deposit, and withdraw, where I can apply validation and business rules."


Is encapsulation just making variables private?
    No.Making a variable private is part of implementing encapsulation, but encapsulation is broader:
    Encapsulation means keeping an object's state and behavior together and controlling how its internal state can be accessed or modified.

    For example:

private double balance;

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    }
}

Here the data:
balance

and the behavior that controls it:
deposit()

are encapsulated inside BankAccount.

Easy way to remember

Think:

Encapsulation = DATA + CONTROL

       BankAccount
      ┌──────────────────┐
      │ private balance  │ ← DATA
      │                  │
      │ deposit()        │ ← CONTROL
      │ withdraw()       │ ← CONTROL
      │ getBalance()     │ ← CONTROLLED ACCESS
      └──────────────────┘
*/
class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public void setaccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getaccountNumber(){
        return accountNumber;
    }

    public void setaccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
    public String getaccountHolder(){
        return accountHolder;
    }

    public void setBalance(double balance){
        if (balance >0)
            this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited amount " + amount + "into your account");
        }
        else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }
    public void withdraw(double amount){
        if (amount >0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn is "+ amount);
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
public class EncapsulationExample {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.setaccountNumber(101);
        b1.setaccountHolder("David");
        b1.setBalance(100000);

        b1.deposit(10000);
        System.out.println("Balance Amount = " + b1.getBalance());

        b1.withdraw(2500);
        System.out.println("Balance Amount = " + b1.getBalance());


    }
}