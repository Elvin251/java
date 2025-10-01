package Lesson40Practice.Evisi1;

public class Task2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            try {
                int result = 10 / 0; // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Daxili blokda ArithmeticException handle edildi: " + e.getMessage());
            }

            arr[5] = 100; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Xarici blokda ArrayIndexOutOfBoundsException handle edildi: " + e.getMessage());
        }
    }
}
