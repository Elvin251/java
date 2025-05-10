import java.util.Scanner;
public class Lesson9Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ders praktikasi 2
//1
        int i = 2;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
//        7
        int i2 = 1;
        int sum = 0;
        while (i2 <= 100) {
            sum += i2;
            i2++;
        }
        System.out.println("Cəm: " + sum);
//        8
        int i3 = 1;
        while (i3 <= 100) {
            if (i3 % 7 == 0) {
                System.out.println(i3);
            }
            i3++;
        }
//        9
        System.out.print("Ədəd daxil edin: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Ədəd cütdür.");
        } else {
            System.out.println("Ədəd təkdir.");
        }
//        10
        int i4 = 1;
        while (i4 <= 200) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
            i4++;
//            ders praktikasi 3
//            1
            int i5 = 50;
            while (i5 >= 20) {
                System.out.println(i5);
                i5--;
            }
//            2
            double i6 = 0.0;
            while (i6 <= 5.0) {
                System.out.printf("eded=", i6);
                i6 += 0.1;
//                ev isi 2
//                1
                int i7 = 16;
                while (i7 < 40) {
                    System.out.println(i7);
                    i7++;
//                    2
                    int i8 = 21;
                    while (i8 < 50) {
                        if (i8 % 2 != 0) {
                            System.out.println(i8);
                        }
                        i8++;
                    }
                }
            }
        }
    }
}
