package Lesson17Homework;

public class CalculateTax {
    public static double calculateTax(double salary) {
        if (salary <= 2000) {
            return 0;
        } else if (salary <= 5000) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }
}
