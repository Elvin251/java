package Lesson29Practice.Task6;

public class Main {
    public static void main(String[] args) {
        String phone1 = "7-098-0234-1239-555-44-99";
        String phone2 = "7-123-4567-8910-222-33-44";
        String phone3 = "7098023412395554499";


        String pattern = "[0-9]-[0-9]{3}-[0-9]{4}-[0-9]{4}-[0-9]{3}-[0-9]{2}-[0-9]{2}";
        System.out.println(phone1.matches(pattern));
        System.out.println(phone2.matches(pattern));
        System.out.println(phone3.matches(pattern));
    }
}
