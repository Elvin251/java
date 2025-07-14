package Lesson26Homework.Task2;

public class BankAccount {
    private double balance;

    public void setBalance(double b) {
        if (b > 0) {
            balance = b;
        } else {
            System.out.println("Balance must be positive!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
