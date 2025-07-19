package Lesson28Homework.Task10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Şəxsiyyət nömrəsini daxil edin: ");
        String id = sc.nextLine();

        if (id.startsWith("AZE")) {
            System.out.println("Doğrudur: AZE ilə başlayır");
        } else {
            System.out.println("Yanlışdır: AZE ilə başlamır");
        }
    }
}
