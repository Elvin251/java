import java.util.Scanner;
public class Lesson6homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1)
        System.out.println("----- 1. Name, Age, City -----");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("--------------------------------\n");

        // 2)
        System.out.println("----- 2. Square -----");
        System.out.print("Enter the square side: ");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        double area = side * side;
        System.out.println("Square side: " + side);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("--------------------------------\n");

        // 3)
        System.out.println("----- 3. Exam Averages -----");
        System.out.print("Math: ");
        double math = scanner.nextDouble();
        System.out.print("English: ");
        double english = scanner.nextDouble();
        System.out.print("History: ");
        double history = scanner.nextDouble();
        double average = (math + english + history) / 3;
        System.out.println("Math: " + math);
        System.out.println("English: " + english);
        System.out.println("History: " + history);
        System.out.println("Average: " + average);
        System.out.println("--------------------------------\n");

        // 4)
        System.out.println("----- 4. Increment & Decrement -----");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Number: " + number);
        number += 10;
        System.out.println("After increment (+10): " + number);
        number -= 5;
        System.out.println("After decrement (-5): " + number);
        System.out.println("--------------------------------\n");

        // 5)
        System.out.println("----- 5. Modulus Assignment -----");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int modulus = number % 3;
        System.out.println("Number: " + number);
        System.out.println("Equation: number % 3 = " + modulus);
        System.out.println("--------------------------------\n");

        // 6)
        System.out.println("----- 6. Average Speed -----");
        System.out.print("First car's speed: ");
        double speed1 = scanner.nextDouble();
        System.out.print("Second car's speed: ");
        double speed2 = scanner.nextDouble();
        double avgSpeed = (speed1 + speed2) / 2;
        System.out.println("First car's speed: " + speed1);
        System.out.println("Second car's speed: " + speed2);
        System.out.println("Average: " + avgSpeed);
        System.out.println("--------------------------------\n");

        // 7)
        System.out.println("----- 7. Arithmetic Operations -----");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        scanner.close();
    }
}
