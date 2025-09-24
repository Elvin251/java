package Lesson37Homework;

class BankAccount {
    double balance;
    BankAccount(double b) { balance = b; }
    void deposit(double amount) { balance += amount; }
    void withdraw(double amount) { balance -= amount; }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double b) { super(b); }
    @Override
    void withdraw(double amount) {
        if(amount <= 1000) balance -= amount;
        else System.out.println("Withdrawal exceeds limit for SavingsAccount");
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(double b) { super(b); }
    @Override
    void withdraw(double amount) {
        double fee = 2;
        if(amount + fee <= balance) balance -= (amount + fee);
        else System.out.println("Insufficient balance for CheckingAccount");
    }
}

class Main9 {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount(2000);
        BankAccount c = new CheckingAccount(2000);
        s.withdraw(500); System.out.println("Savings Balance: " + s.balance);
        c.withdraw(500); System.out.println("Checking Balance: " + c.balance);
    }
}
