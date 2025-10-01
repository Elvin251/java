package Lesson40Practice.Evisi2;

// Custom Exception
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 100) {
            throw new LowBalanceException("Balans çox aşağıdır! Minimum 100 qalmalıdır.");
        } else {
            balance -= amount;
            System.out.println("Pul çıxarıldı: " + amount + " | Yeni balans: " + balance);
        }
    }
}

 class CustomExceptionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        try {
            account.withdraw(450); // burda exception yaranacaq
        } catch (LowBalanceException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
