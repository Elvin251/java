package Lesson39Homework;

public class Task5 {
    public static void main(String[] args) {
        Integer num = null;
        try {
            int result = num + 5;
            System.out.println("Nəticə: " + result);
        } catch (NullPointerException e) {
            System.out.println("Ədəd null olduğu üçün əməliyyat mümkün deyil!");
        }
    }
}
