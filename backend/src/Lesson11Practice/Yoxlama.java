
package Lesson11Practice;
import java.util.Scanner;
public class Yoxlama {
    public static void main(String[] args) {
//      1)
        System.out.println("50–150 aralığında 2, 3 və 7-yə bölünən ədədlər:");
        for (int n = 50; n <= 150; n++) {
            if (n % 2 == 0 && n % 3 == 0 && n % 7 == 0) {
                System.out.print(n + " ");
            }
        }
//        2)
        Scanner sc = new Scanner(System.in);
        System.out.print("Yoxlanacaq ədədi daxil edin: ");
        int n2 = sc.nextInt();


        if (n2 % 2 == 0 && n2 % 3 == 0) {
            System.out.println("Hello World");
        } else {
            System.out.println("Not found");
        }

        sc.close();
//3)
        System.out.println("1-dən 100-ə 5 vahid artan ədədlər:");
        for (int n1 = 1; n1 <= 100; n1 += 5) {
            System.out.println(n1);
        }
//        chatda ikinci olanlar

    }
}
