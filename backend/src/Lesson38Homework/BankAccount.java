package Lesson38Homework;

class BankAccount {
    double balance;
    BankAccount(double balance) { this.balance = balance; }

    void deposit(double amount) { balance += amount; }
    void deposit(double amount, double bonus) { balance += amount + bonus; }

    void printBalance() { System.out.println("Balance: " + balance); }
}

 class Main15 {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(500);
        a.deposit(200);
        a.deposit(100, 10);
        a.printBalance();
    }
}
