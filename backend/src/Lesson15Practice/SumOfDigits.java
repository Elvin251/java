package Lesson15Practice;
import java.util.Scanner;

public class SumOfDigits {

    public static int sumDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("eded daxil et: ");
        int num = scanner.nextInt();
if (num<0){
    System.out.println("bu ededi icra etmek olmur");
}else {
    int result = sumDigits(num);

    System.out.println("The sum is " + result);
}

    }
}