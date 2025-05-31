package Lesson15Practice;
import java.util.Scanner;

public class TriangleArea {
    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side-1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Input Side-2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Input Side-3: ");
        double side3 = scanner.nextDouble();

        if (side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1) {

            double area = calculateArea(side1, side2, side3);
            System.out.println("The area of the triangle is " + area);
        } else {
            System.out.println("Invalid triangle sides!");
        }
    }
}