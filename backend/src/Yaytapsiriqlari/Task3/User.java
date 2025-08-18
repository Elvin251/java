package Yaytapsiriqlari.Task3;
public class User {
    private String username;
    private String email;
    private String password;
    private boolean isActive;

    public User(String username, String email, String password, boolean isActive) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isActive = isActive;
    }

    public boolean checkValidation() {
        if (username == null || username.length() < 3 || username.length() > 10) {
            System.out.println("İstifadəçi adı 3-10 simvol arası olmalıdır.");
            return false;
        }
        if (password == null || password.length() != 8) {
            System.out.println("Şifrə mütləq 8 simvol olmalıdır.");
            return false;
        }
        if (email == null) {
            System.out.println("Email boş ola bilməz.");
            return false;
        }
        return true;
    }

    public void deactivateAccount() {
        if (isActive) {
            isActive = false;
            System.out.println("Hesab deaktiv edildi.");
        } else {
            System.out.println("Hesab artıq deaktivdir.");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
