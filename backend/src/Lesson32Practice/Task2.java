package Lesson32Practice;

public class Task2 {
    public static void main(String[] args) {
        // 1)
        char[] arr = {'A', 'z', 'e', 'r', 'i'};
        String word = new String(arr);
        System.out.println("Massivdən yaranmış String: " + word);

        // 2)
        String test1 = "abc";
        String test2 = "ab1";
        System.out.println("test1 yalnız 3 hərfdən ibarətdir? " + test1.matches("[a-zA-Z]{3}"));
        System.out.println("test2 yalnız 3 hərfdən ibarətdir? " + test2.matches("[a-zA-Z]{3}"));

        // 3)
        String empty = "";
        System.out.println("Boşdur? " + empty.isEmpty());

        // 4) 
        boolean result1 = endsWithCheck("Java is fun", "fun");
        boolean result2 = endsWithCheck("Java is fun", "java");
        System.out.println("Birinci yoxlama: " + result1);
        System.out.println("İkinci yoxlama: " + result2);
    }

    public static boolean endsWithCheck(String str1, String str2) {
        boolean result = str1.endsWith(str2);
        return result;
    }
}
