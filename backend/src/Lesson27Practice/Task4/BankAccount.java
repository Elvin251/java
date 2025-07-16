package Lesson27Practice.Task4;

public class BankAccount {
    private String accountNumber;
    public double balance;
    protected String owner;
    String status;

    public static String bankName = "AzerBank";

    public BankAccount() {}

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
    }

    BankAccount(String accountNumber, double balance, String owner, String status) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.status = status;
    }

    private void checkPIN() {
        System.out.println("PIN checked.");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    protected void showOwner() {
        System.out.println("Owner: " + owner);
    }

    void statusInfo() {
        System.out.println("Account status: " + status);
    }

    public void withdraw(final double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
