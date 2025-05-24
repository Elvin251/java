package Lesson13Practice;

public class Bank {
    String card;
    double balance;

    public Bank(String card, double balance) {
        this.card = card;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    boolean deductAmount(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Kartda kifayet qeder balans yoxdur");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "card='" + card + '\'' +
                ", balance=" + balance +
                '}';
    }
}
