import java.util.Scanner;
public class Lesson7Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1)
        System.out.print("1) Bir ədəd daxil edin: ");
        double number = input.nextDouble();
        if (number > 0) System.out.println("Müsbət ədəd");
        else if (number < 0) System.out.println("Mənfi ədəd");
        else System.out.println("Sıfır");

        // 2)
        System.out.print("2) Bir tam ədəd daxil edin: ");
        int num = input.nextInt();
        if (num % 2 == 0) System.out.println("Cüt ədəd");
        else System.out.println("Tək ədəd");

        // 3)
        System.out.print("3) Birinci ədədi daxil edin: ");
        double a = input.nextDouble();
        System.out.print("İkinci ədədi daxil edin: ");
        double b = input.nextDouble();
        if (a > b) System.out.println("Birinci ədəd daha böyüktür");
        else if (b > a) System.out.println("İkinci ədəd daha böyüktür");
        else System.out.println("Ədədlər bərabərdir");

        // 4)
        System.out.print("4) İmtahan nəticəsini daxil edin (0-100): ");
        int score = input.nextInt();
        if (score >= 90 && score <= 100) System.out.println("Əla");
        else if (score >= 70) System.out.println("Yaxşı");
        else if (score >= 50) System.out.println("Kafi");
        else if (score >= 0) System.out.println("Zəif");
        else System.out.println("Yanlış nəticə");

        // 5)
        System.out.print("5) Birinci ədəd: ");
        double x = input.nextDouble();
        System.out.print("İkinci ədəd: ");
        double y = input.nextDouble();
        System.out.print("Üçüncü ədəd: ");
        double z = input.nextDouble();
        double max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        System.out.println("Ən böyük ədəd: " + max);

        // 6) Ö
        System.out.print("6) Eni daxil edin: ");
        double width = input.nextDouble();
        System.out.print("Uzunluğu daxil edin: ");
        double height = input.nextDouble();
        if (width == height) System.out.println("Kvadrat");
        else System.out.println("Düzbucaqlı");

        // 7)
        System.out.print("7) Bir ədəd daxil edin: ");
        int n = input.nextInt();
        if (n % 3 == 0 && n % 5 == 0) System.out.println("Həm 3-ə, həm də 5-ə bölünür");
        else if (n % 3 == 0) System.out.println("3-ə bölünür");
        else if (n % 5 == 0) System.out.println("5-ə bölünür");
        else System.out.println("Heç birinə bölünmür");

        // 8)
        System.out.print(" 8) Ay nömrəsini daxil edin (1-12): ");
        int ay = input.nextInt();

        if (ay >= 1 && ay <= 12) {
            if (ay == 12 || ay == 1 || ay == 2)
                System.out.println("Qış");
            else if (ay >= 3 && ay <= 5)
                System.out.println("Yaz");
            else if (ay >= 6 && ay <= 8)
                System.out.println("Yay");
            else
                System.out.println("Payız");
        } else {
            System.out.println("Yanlış ay nömrəsi!");
        }


        // 9)
        System.out.print("9) Bir tam ədəd daxil edin: ");
        int checkNum = input.nextInt();
        boolean sadedir = true;
        if (checkNum <= 1) sadedir = false;
        else {
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (checkNum % i == 0) {
                    sadedir = false;
                    break;
                }
            }
        }
        if (sadedir) System.out.println("Sadə ədəd");
        else System.out.println("Mürəkkəb ədəd");

        // 10)
        System.out.print("10) Yaşınızı daxil edin: ");
        int yas = input.nextInt();
        System.out.print("Səfər məsafəsini daxil edin (km): ");
        double mesafe = input.nextDouble();
        double qiymet = mesafe * 0.5;
        if (yas < 12) qiymet *= 0.5;
        else if (yas > 65) qiymet *= 0.7;
        System.out.println("Bilet qiyməti: " + qiymet + " AZN");

        input.close();
    }
}
