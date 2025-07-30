package Lesson31Practice;

    import java.util.Arrays;

    public class DersPraktikasi {
        public static void main(String[] args) {
            // 1
            String name = "Cavid";
            System.out.println("1. name: " + name);

            // 2
            String message = "Java dili güclü və effektiv bir proqramlaşdırma dilidir";
            System.out.println("2. message: " + message);

            // 3
            System.out.println("3. Simvol sayı: " + message.length());

            // 4
            System.out.println("4. 2-ci simvol: " + message.charAt(1));

            // 5
            System.out.println("5. 'i' simvolu ilk dəfə indeks: " + message.indexOf('i'));

            // 6
            System.out.println("6. Kiçikləşdirilmiş: " + message.toLowerCase());

            // 7
            System.out.println("7. Böyüdülmüş: " + message.toUpperCase());

            // 8
            System.out.println("8. 'olub' var mı? " + message.contains("olub"));

            // 9
            System.out.println("9. Sətir 'dilidir' ilə bitir mi? " + message.endsWith("dilidir"));

            // 10
            System.out.println("10. Sətir 'Java' ilə başlayır mı? " + message.startsWith("Java"));

            // 11
            message = "   Adil   ";
            System.out.println("11. Yeni message: '" + message + "'");

            // 12
            System.out.println("12. Trim ilə: '" + message.trim() + "'");

            // 13
            message = "Baxtiyar";
            System.out.println("13. Yeni message: " + message);

            // 14
            System.out.println("14. İlk 4 simvol: " + message.substring(0, 4));

            // 15
            message = "Əli Həsənov";
            System.out.println("15. Yeni message: " + message);

            // 16
            String[] hisseler = message.split(" ");

            // 17
            System.out.println("17. Massiv: " + Arrays.toString(hisseler));

            System.out.println("\n--- Dərs Praktikası 2 ---");


        }
    }

