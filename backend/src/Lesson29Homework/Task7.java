package Lesson29Homework;
public class Task7 {
    public static void main(String[] args) {
        String phone = "055-909-12-23";
        String pattern = "[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}";

        if (phone.matches(pattern)) {
            System.out.println("Telefon nömrəsi düzgündür.");
        } else {
            System.out.println("Telefon nömrəsi yanlışdır.");
        }
    }
}