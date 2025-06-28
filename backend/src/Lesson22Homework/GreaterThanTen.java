package Lesson22Homework;

public class GreaterThanTen {
    public static void main(String[] args) {
        double[] arr = {5.4, 10.1, 15.2, 8.8, 20.5};
        System.out.println("10-dan böyük ədədlər:");
        for (double num : arr) {
            if (num > 10) System.out.println(num);
        }
    }
}
