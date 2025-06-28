package Lesson22Homework;

public class NegatıveSum {
    public static void main(String[] args) {
        double[] arr = {2.5, -3.1, 4.2, -1.7, -0.5};
        double sum = 0;
        for (double num : arr) {
            if (num < 0) sum += num;
        }
        System.out.println("Mənfi ədədlərin cəmi: " + sum);
    }
}
