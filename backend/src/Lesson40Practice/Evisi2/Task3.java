package Lesson40Practice.Evisi2;

public class Task3{
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Yaş 18-dən yuxarı olmalıdır");
        } else {
            System.out.println("Qeydiyyat tamamlandı");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Xəta: " + e.getMessage());
        }
    }
}
