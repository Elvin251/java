package Lesson36Homework;

import java.util.ArrayList;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    double balance;
    double interestRate = 0.05;

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
    public void calculateInterest() { balance += balance * interestRate; }
    public void viewBalance() { System.out.println("Savings balance: " + balance); }
}

class CurrentAccount implements Account {
    double balance;

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
    public void calculateInterest() { System.out.println("Current account has no interest."); }
    public void viewBalance() { System.out.println("Current balance: " + balance); }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    public void addAccount(Account acc) { accounts.add(acc); }
}

 class Main4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(500);
        sa.calculateInterest();
        sa.viewBalance();

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(1000);
        ca.withdraw(200);
        ca.viewBalance();

        bank.addAccount(sa);
        bank.addAccount(ca);
    }
}
