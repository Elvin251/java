package Lesson16Practice;

public class Task17 {
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
        } else {
            System.out.println("Yetərsiz balans");
        }
    }

    public  void checkBalance() {
        System.out.println("Balans: " + balance);
    }
}
