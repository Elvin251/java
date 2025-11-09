package az.developia.demo2.Lesson51Homework.Task3;

public class AccountEntity {
    private Long id;
    private String cardNumber;
    private double balance;
    private String name;
    private String surname;

    public AccountEntity() {}

    public AccountEntity(Long id, String cardNumber, double balance, String name, String surname) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
}