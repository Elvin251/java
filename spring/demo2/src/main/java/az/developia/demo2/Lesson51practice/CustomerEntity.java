package az.developia.demo2.Lesson51practice;

public class CustomerEntity {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Double balance;

    public CustomerEntity() {}

    public CustomerEntity(Long id, String name, String surname, String email, String phone, Double balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public Double getBalance() { return balance; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setBalance(Double balance) { this.balance = balance; }
}