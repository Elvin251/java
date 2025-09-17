package Lesson35Homework;

class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot go below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}

class Main5 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(500);
        sa.withdraw(450);  // Denied
        sa.withdraw(300);  // Success
    }
}
