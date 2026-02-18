import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Eded daxil edin (0 bitirir): ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("Ededlerin cemi: " + sum);
    }
}