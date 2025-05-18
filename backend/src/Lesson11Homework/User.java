package Lesson11Homework;

public class User {
    String username;
    String email;
    String password;

    public User(String u, String e, String p) {
        username = u;
        email = e;
        password = p;
    }

    public String toString() {
        return "User{username='" + username + "', email='" + email + "', password='" + password + "'}";
    }
}
