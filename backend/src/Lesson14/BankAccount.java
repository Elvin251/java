package Lesson14;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount() {
        this.owner = "No Name";
        this.balance = 0.0;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void showAccount() {
        System.out.println("Owner: " + owner + ", Balance: $" + balance);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.showAccount();

        BankAccount account2 = new BankAccount("Aysel", 1500.75);
        account2.showAccount();
    }
}
