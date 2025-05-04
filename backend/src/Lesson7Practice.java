import java.util.Scanner;
public class Lesson7Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.print("İşçinin maaşını daxil edin: ");
        int salary = scanner.nextInt();

        if (salary > 7000 && salary % 3 == 0) {
            System.out.println("İşçinin maaşı: " + salary);
            System.out.println("Varlıdır");
        } else {
            System.out.println("Kasibdir");
        }

        // 2.
        int num1 = 30;
        int num2 = 45;
        int num3 = 40;

        double average = (num1 + num2 + num3) / 3.0;

        if (average > 1 && average < 50) {
            System.out.println("Great Job");
        }

        // 3.
        double length = 5.0;
        double width = 3.0;

        double area = length * width;
        double perimeter = 2 * (length + width);

        if (area > perimeter * 10) {
            System.out.println("Area is bigger");
        } else {
            System.out.println("Perimeter is bigger");
        }

        // 4.
        int numA = 15;
        int numB = 5;

        int sum = numA + numB;
        int difference = numA - numB;
        int product = numA * numB;
        double quotient = (double) numA / numB;

        if (sum % 5 == 0 && difference % 5 == 0 && product % 5 == 0 && quotient % 5 == 0) {
            System.out.println("Elasan");
 }

    }
}
