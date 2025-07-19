package Lesson28Practice.Task9;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir söz daxil edin: ");
        String word = sc.nextLine();

        if (word.endsWith("ing") || word.endsWith("ion") || word.endsWith("ed")) {
            System.out.println("Söz uyğun sonluqla bitir.");
        } else {
            System.out.println("Söz uyğun sonluqla bitmir.");
        }
    }
}
