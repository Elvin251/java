package Yaytapsiriqlari.Task4.Bolt;
public class Bank {
    private String cardNumber;
    private double balance;

    public Bank(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Ödəniş uğurlu oldu. Yeni balans: " + balance);
            return true;
        } else {
            System.out.println("Balans kifayət etmir!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bank{cardNumber='" + cardNumber + "', balance=" + balance + "}";
    }
}
