package Lesson32Practice;

public class Task1 {
    public static void main(String[] args) {
        // 1)
        String name = "Məhərrəm";
        System.out.println(name);

        // 2)
        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println(message);

        // 3)
        System.out.println("Simvol sayı: " + message.length());

        // 4)
        System.out.println("7-ci simvol: " + message.charAt(6));

        // 5)
        System.out.println("'n' simvolunun indeksi: " + message.indexOf('n'));

        // 6)
        System.out.println("Kiçik: " + message.toLowerCase());

        // 7)
        System.out.println("Böyük: " + message.toUpperCase());

        // 8)
        System.out.println("‘x’ var? " + message.contains("x"));

        // 9)
        System.out.println("‘faydalıdır’ ilə bitir? " + message.endsWith("faydalıdır"));

        // 10) S
        System.out.println("‘Java’ ilə başlayır? " + message.startsWith("Java"));

        // 11)
        name = "   Ayxan    ";
        System.out.println("Boşluqlu: '" + name + "'");
        System.out.println("Trim edilmiş: '" + name.trim() + "'");

        // 12)
        name = "Kamil";
        System.out.println("İlk 4 simvol: " + name.substring(0, 4));

        // 13)
        name = "Hüseyn Mehdizadə";

        // 14)
        String[] parts = name.split(" ");

        // 15)
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
