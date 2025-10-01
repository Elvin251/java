package Lesson40Practice.Evisi1;

public class Task4{
    public static void main(String[] args) {
        try {
            int x = 10 / 0;
            String s = null;
            System.out.println(s.length());
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Xeta handle edildi: " + e);
        }
    }
}
