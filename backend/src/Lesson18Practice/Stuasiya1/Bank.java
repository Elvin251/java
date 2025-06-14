package Lesson18Practice.Stuasiya1;

public class Bank {
    String cardNumber;
    Double balance;

    public Bank(String cardNumber, Double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println( ": Xəta — balans kifayət etmir.");
        } else {
            balance -= amount;
            System.out.println( amount + " AZN çıxarıldı. Yeni balans: " + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + cardNumber + " balance=" + balance + "}";
    }
}
