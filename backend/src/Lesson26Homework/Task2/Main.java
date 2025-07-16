package Lesson26Homework.Task2;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(500.0);
        System.out.println("Balance: " + account.getBalance());

        account.setBalance(-200);
    }

}
