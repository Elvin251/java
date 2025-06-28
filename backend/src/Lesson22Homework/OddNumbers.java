package Lesson22Homework;

public class OddNumbers {

        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 8, 11, 14, 17};
            System.out.println("Tək ədədlər:");
            for (int num : arr) {
                if (num % 2 != 0) System.out.println(num);
            }
        }


}
