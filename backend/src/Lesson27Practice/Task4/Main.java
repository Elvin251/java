package Lesson27Practice.Task4;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount("ACC123");
        BankAccount a3 = new BankAccount("ACC456", "Rovshan");
        BankAccount a4 = new BankAccount("ACC789", 1200, "Leyla", "Active");

        a2.deposit(200);
        a4.withdraw(300);
        a4.showOwner();
        a3.statusInfo();

        System.out.println("Bank name: " + BankAccount.bankName);
    }
}
