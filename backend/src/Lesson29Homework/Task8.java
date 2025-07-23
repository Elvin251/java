package Lesson29Homework;
public class Task8 {
    public static void main(String[] args) {
        String str1 = "Baku State University";
        String str2 = "Azerbaijan University";

        boolean result = str1.regionMatches(11, str2, 11, 10);
        System.out.println("University hissələri eynidirmi? " + result);
    }
}