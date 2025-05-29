package Lesson14Homework;

public class UseMain {
    public static void main(String[] args) {
        User user = new User("mehdi123", "mehdi@gmail.com", "12345678", true);
        System.out.println(user);
        user.checkValidation();
        user.deactivateAccount();
        user.deactivateAccount();
    }
}
