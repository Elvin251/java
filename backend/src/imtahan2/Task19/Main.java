package imtahan2.Task19;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {16, 24, 54, 100};
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max)
                max = n;
        }
        System.out.println("Ən böyük:"+max);
    }
}
