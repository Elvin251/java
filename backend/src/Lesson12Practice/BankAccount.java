package Lesson12Practice;

public class BankAccount {
    String accountNumber;
    String owner;
    double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String owner) {
        this(accountNumber, owner, 0.0);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + ": " + amount + " AZN yatırıldı. Yeni balans: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(owner + ": Xəta — balans kifayət etmir.");
        } else {
            balance -= amount;
            System.out.println(owner + ": " + amount + " AZN çıxarıldı. Yeni balans: " + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber + "', owner='" + owner + "', balance=" + balance + "}";
    }
}
