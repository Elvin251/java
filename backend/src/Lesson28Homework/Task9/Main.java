package Lesson28Homework.Task9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cümlə daxil edin: ");
        String cumle = sc.nextLine();

        if (cumle.endsWith("?")) {
            System.out.println("Bu sualdır");
        } else {
            System.out.println("Bu sual deyil");
        }
    }
}
