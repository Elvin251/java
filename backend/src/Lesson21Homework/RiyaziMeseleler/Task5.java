package Lesson21Homework.RiyaziMeseleler;

public class Task5 {
    public static int countDigits(int number) {
        if (number == 0) return 1;

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 123456;
        System.out.println(num + " ədədi " + countDigits(num) + " rəqəmlidir");
    }
}
