package Yaytapsiriqlari.Task4.Bolt;
public class Customer {
    private String name;
    private String surname;
    private String phone;

    public Customer(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', surname='" + surname + "', phone='" + phone + "'}";
    }
}
