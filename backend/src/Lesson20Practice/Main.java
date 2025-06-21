package Lesson20Practice;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Azərbaycan", "Bakı", "Nizami küçəsi 123");
        User user = new User("elvin123", "sifre123", "elvin@example.com", address, Status.ACTIVE);

        user.printUserInfo();
    }
}
