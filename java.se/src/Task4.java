public class Task4 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 1};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Massivde en boyuk eded: " + max);
    }
}
