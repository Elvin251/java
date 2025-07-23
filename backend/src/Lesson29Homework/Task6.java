package Lesson29Homework;
public class Task6 {
    public static void main(String[] args) {
        String phone = "1-909-202-121-90-90";
        String pattern = "[0-9]-[0-9]{3}-[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}";

        if (phone.matches(pattern)) {
            System.out.println("Telefon nömrəsi düzgündür.");
        } else {
            System.out.println("Telefon nömrəsi yanlışdır.");
        }
    }
}