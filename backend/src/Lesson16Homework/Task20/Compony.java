package Lesson16Homework.Task20;

public class Compony {
    public static double applyDiscount(double totalAmount) {
        if (totalAmount > 2000) {
            return totalAmount * 0.9;
        } else {
            return totalAmount;
        }
    }
}
