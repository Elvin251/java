package Lesson21Homework.RiyaziMeseleler;

public class Task4 {
    public static void main(String[] args) {
        int tekSay = 0;
        int cutSay = 0;

        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                cutSay++;
            } else {
                tekSay++;
            }
        }

        System.out.println("Tək ədədlərin sayı: " + tekSay);
        System.out.println("Cüt ədədlərin sayı: " + cutSay);
    }
}
