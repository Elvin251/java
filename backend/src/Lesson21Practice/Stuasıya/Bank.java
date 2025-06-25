package Lesson21Practice.Stuasıya;

public class Bank {
     double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void pay(double amount) {
        if (amount > balance) {
            System.out.println("Kifayət qədər balans yoxdur!");
        } else {
            balance -= amount;
            System.out.println("Ödəniş edildi: " + amount + " AZN");
            System.out.println("Qalıq balans: " + balance + " AZN");
        }
    }
}
