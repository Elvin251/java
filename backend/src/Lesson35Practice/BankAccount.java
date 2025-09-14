package Lesson35Practice;

abstract class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) { super(balance); }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings deposit: " + amount + ", Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) { super(balance); }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current deposit: " + amount + ", Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount; // overdraft allowed
        System.out.println("Current withdrawal: " + amount + ", Balance: " + balance);
    }
}
