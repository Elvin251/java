package SinaqImtahani.PrimeOrComposite;
import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ədəd daxil edin: ");
        int number = input.nextInt();

        if (number < 2) {
            System.out.println("Bu ədəd nə sadədir, nə də mürəkkəb.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " sadə ədəddir.");
            } else {
                System.out.println(number + " mürəkkəb ədəddir.");
            }
        }
    }
}
