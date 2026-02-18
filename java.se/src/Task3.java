public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 9, 12, 15};
        System.out.print("2 ve 3-e bolunenler: ");
        for (int num : arr) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
