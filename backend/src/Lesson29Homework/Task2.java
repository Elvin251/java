package Lesson29Homework;
public class Task2 {
    public static void main(String[] args) {
        String str = "Hello";
        char[] src = {'d', 'd', 'a', 'a', 'p'};
        str.getChars(0, 4, src, 0); // İlk 4 simvolu (Hell) src massivinə köçür
        System.out.println(src); // Nəticə: Hellp
    }
}