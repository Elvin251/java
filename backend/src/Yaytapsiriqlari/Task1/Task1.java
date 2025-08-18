package Yaytapsiriqlari.Task1;
public class Task1 {
    public static void main(String[] args) {
        // 1)
        int[] arr1 = {2, 3, 6, 9, 12, 15, 18, 20};
        System.out.print("2 və 3-ə bölünənlər: ");
        for (int num : arr1) {
            if (num % 2 == 0 && num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        // 2)
        double[] arr2 = {2.5, 3.7, 1.2, 4.4};
        double sum = 0;
        for (double d : arr2) {
            sum += d;
        }
        System.out.println("Double massivində cəm: " + sum + "\n");

        // 3)
        int[] arr3 = {15, 3, 27, -5, 42, 8};
        int min = arr3[0], max = arr3[0];
        for (int num : arr3) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Ən kiçik: " + min);
        System.out.println("Ən böyük: " + max + "\n");

        // 4)
        String[] arr4 = {"alma", "banan", "nar", "qarpiz", "armud"};
        String longest = arr4[0];
        for (String s : arr4) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("Ən uzun söz: " + longest + "\n");

        // 5)
        Student[] students = {
                new Student("Ali", 80, 75, 90, "ADNSU"),
                new Student("Veli", 70, 65, 60, "BDU"),
                new Student("Aysel", 95, 85, 100, "ADU"),
                new Student("Murad", 60, 55, 70, "ADNSU"),
                new Student("Nigar", 88, 92, 91, "XDU")
        };

        Student best = students[0];
        for (Student s : students) {
            if (s.average() > best.average()) {
                best = s;
            }
        }
        System.out.println("Ən yüksək ortalama: " + best + "\n");

        // 6)
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Cütlər: ");
        for (int num : arr6) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.print("\nTəklər: ");
        for (int num : arr6) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println("\n");

        // 7)
        int[] arr7 = {5, 8, 13, 22, 7, 6};
        int oddSum = 0;
        for (int num : arr7) {
            if (num % 2 != 0) oddSum += num;
        }
        System.out.println("Tək ədədlərin cəmi: " + oddSum);
    }
}


