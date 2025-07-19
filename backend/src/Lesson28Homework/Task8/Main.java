package Lesson28Homework.Task8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fayl adı daxil edin: ");
        String fayl = sc.nextLine();

        if (fayl.endsWith(".doc")) {
            System.out.println("Word");
        } else if (fayl.endsWith(".jpg")) {
            System.out.println("Image");
        } else if (fayl.endsWith(".mp3")) {
            System.out.println("Music");
        } else {
            System.out.println("Naməlum format");
        }
    }
}
