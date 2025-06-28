package Lesson22Homework;

public class AboveAverage {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        double sum = 0;
        for (int num : arr) sum += num;
        double average = sum / arr.length;
        System.out.println("Ortalama: " + average);
        System.out.println("Ortalamadan böyük ədədlər:");
        for (int num : arr) {
            if (num > average) System.out.println(num);
        }
    }
}
