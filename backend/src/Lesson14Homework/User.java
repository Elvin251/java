package Lesson14Homework;

public class User {
    String username;
    String email;
    String password;
    boolean isActive;

    public User(String username, String email, String password, boolean isActive) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    public void checkValidation() {
        if (username.length() >= 3 && username.length() <= 10 &&
                password.length() == 8 &&
                email != null) {
            System.out.println("Hesab uğurla yaradıldı.");
        } else {
            System.out.println("Məlumatlar düzgün deyil.");
        }
    }

    public void deactivateAccount() {
        if (isActive) {
            isActive = false;
            System.out.println("Hesab deaktiv edildi.");
        } else {
            System.out.println("Hesab artıq deaktivdir.");
        }
    }

    public String toString() {
        return "İstifadəçi adı: " + username + "\nEmail: " + email +
                "\nŞifrə: " + password + "\nAktivdir?: " + isActive;
    }
}
