package Lesson33.Task2;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345");
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Balans: " + acc.getBalance());
    }
}
