package Lesson20Homework.Stuasiya;

public class Customer {
    String name;
    String surname;
 String phone;

    public Customer(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getPhone() {
        return phone;
    }
}
