package Lesson31Practice;
import java.util.Arrays;
public class DersPraktikasi2 {
    public static void main(String[] args) {
        // 1
        char[] simvollar = {'J', 'a', 'v', 'a', ' ', '1', '1'};
        String str1 = new String(simvollar);
        System.out.println("1. Massivdən String: " + str1);

        // 2
        String str2 = "Hello";
        boolean sadece5Simvol = str2.length() == 5 && str2.matches("[a-zA-Z]{5}");
        System.out.println("2. Sadece 5 simvol (ən): " + sadece5Simvol);

        // 3
        String bosStr = "";
        System.out.println("3. Boşdurmu: " + bosStr.isEmpty());

        // 4
        String cumle = "Java öyrənmək çətindir";
        String axtarilan = "çətindir";
        String evezEdilen = "asandır";
        String netice = cumle.replace(axtarilan, evezEdilen);
        System.out.println("4. Əvəz olunmuş: " + netice);
    }
}
