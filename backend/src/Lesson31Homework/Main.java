package Lesson31Homework;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Cümlədə neçə simvol olduğunu tap
        System.out.print("1) Cümə daxil et: ");
        String cumle1 = sc.nextLine();
        System.out.println("Simvol sayı: " + cumle1.length());

        // 2. Ad və soyadı birləşdir
        System.out.print("\n2) Adı daxil et: ");
        String ad = sc.nextLine();
        System.out.print("Soyadı daxil et: ");
        String soyad = sc.nextLine();
        String tamAd = ad + " " + soyad;
        System.out.println("Tam ad: " + tamAd);

        // 3. 4-cü simvolu tap
        System.out.print("\n3) Sətir daxil et: ");
        String cumle3 = sc.nextLine();
        if (cumle3.length() >= 4) {
            System.out.println("4-cü simvol: " + cumle3.charAt(3));
        } else {
            System.out.println("Sətir çox qısadır.");
        }

        // 4. Email-in @gmail.com ilə bitib-bitmədiyini yoxla
        System.out.print("\n4) Email daxil et: ");
        String email = sc.nextLine();
        System.out.println(email.endsWith("@gmail.com") ? "Gmail ünvanıdır." : "Gmail deyil.");

        // 5. İki parolun eyni olub-olmadığını yoxla
        System.out.print("\n5) Parol 1 daxil et: ");
        String parol1 = sc.nextLine();
        System.out.print("Parol 2 daxil et: ");
        String parol2 = sc.nextLine();
        System.out.println(parol1.equals(parol2) ? "Parollar eynidir." : "Parollar fərqlidir.");

        // 6. İlk 'a' hərfinin indeksini tap
        System.out.print("\n6) Sətir daxil et: ");
        String cumle6 = sc.nextLine();
        int indexA = cumle6.indexOf('a');
        System.out.println(indexA >= 0 ? "'a' hərfi indeksi: " + indexA : "'a' tapılmadı.");

        // 7. Mətn tamamilə boşdurmu?
        System.out.print("\n7) Mətn daxil et: ");
        String metn = sc.nextLine();
        System.out.println(metn.trim().isEmpty() ? "Mətn boşdur." : "Mətn boş deyil.");

        // 8. Boşluqları - ilə əvəz et
        System.out.print("\n8) Cümlə daxil et: ");
        String cumle8 = sc.nextLine();
        System.out.println("Nəticə: " + cumle8.replace(" ", "-"));

        // 9. Tam adı hissələrə böl
        System.out.print("\n9) Tam ad və soyad daxil et: ");
        String tam9 = sc.nextLine();
        String[] hisseler = tam9.split(" ");
        for (int i = 0; i < hisseler.length; i++) {
            System.out.println((i+1) + ". hissə: " + hisseler[i]);
        }

        // 10. Telefon nömrəsi +994 ilə başlayırmı?
        System.out.print("\n10) Telefon nömrəsi daxil et: ");
        String tel = sc.nextLine();
        System.out.println(tel.startsWith("+994") ? "Doğrudur." : "Yanlışdır.");

        // 11. 5-ci indeksdən sonrasını çıxar
        System.out.print("\n11) Cümlə daxil et: ");
        String cumle11 = sc.nextLine();
        if (cumle11.length() >= 6) {
            System.out.println("5-ci indeksdən sonrası: " + cumle11.substring(5));
        } else {
            System.out.println("Cümlə çox qısadır.");
        }

        // 12. Cümləni həm böyük, həm kiçik hərflərlə yaz
        System.out.print("\n12) Cümlə daxil et: ");
        String cumle12 = sc.nextLine();
        System.out.println("Böyük: " + cumle12.toUpperCase());
        System.out.println("Kiçik: " + cumle12.toLowerCase());

        // 13. “Java” sözü var?
        System.out.print("\n13) Cümlə daxil et: ");
        String cumle13 = sc.nextLine();
        System.out.println(cumle13.contains("Java") ? "\"Java\" mövcuddur." : "\"Java\" yoxdur.");

        // 14. Başlanğıc və son boşluqları sil
        System.out.print("\n14) Cümlə daxil et: ");
        String cumle14 = sc.nextLine();
        System.out.println("Nəticə: \"" + cumle14.trim() + "\"");

        sc.close();
    }
}
