package Lesson38Homework;

import java.util.ArrayList;

class Account {
    String number;
    double balance;

    Account(String number, double balance) {
        this.number = number; this.balance = balance;
    }

    void deposit(double amount) { balance += amount; }
    void withdraw(double amount) { if (balance >= amount) balance -= amount; }

    void printInfo() {
        System.out.println("Account: " + number + ", Balance: " + balance);
    }
}

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account a) { accounts.add(a); }
    void removeAccount(Account a) { accounts.remove(a); }
}

class Main7 {
    public static void main(String[] args) {
        Bank b = new Bank();
        Account a1 = new Account("111", 500);
        b.addAccount(a1);
        a1.deposit(200);
        a1.withdraw(100);
        a1.printInfo();
    }
}
