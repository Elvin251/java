package Lesson20Practice;

public class User {
 String username;
   String password;
    String email;
     Address address;
     Status status;

    public User(String username, String password, String email, Address address, Status status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.status = status;
    }

    public void printUserInfo() {
        System.out.println("İstifadəçi adı: " + username);
        System.out.println("Email: " + email);
        System.out.println("Status: " + status);
        System.out.println("Ünvan:");
        System.out.println("  Ölkə: " + address.country());
        System.out.println("  Şəhər: " + address.city());
        System.out.println("  Dəqiq ünvan: " + address.address());
    }
}
