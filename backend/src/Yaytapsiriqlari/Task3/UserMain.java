package Yaytapsiriqlari.Task3;
public class UserMain {
    public static void main(String[] args) {
        User u1 = new User("Elvin", "elvin@gmail.com", "12345678", true);
        User u2 = new User("Ali", null, "abcd1234", true);

        System.out.println(u1);
        System.out.println("Validation: " + u1.checkValidation());
        u1.deactivateAccount();
        u1.deactivateAccount();

        System.out.println("\n" + u2);
        System.out.println("Validation: " + u2.checkValidation());
    }
}
