package Lesson29Homework;
public class Task3 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] dest = {'a', 'a', 'd', 'd', 'a'};
        str.getChars(2, 4, dest, 1); // "ll" hissəsini 1-ci indeksdən başlayaraq yerləşdir
        System.out.println(dest);
    }
}