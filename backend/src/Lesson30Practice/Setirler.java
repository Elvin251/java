package Lesson30Practice;
public class Setirler {
    public static void main(String[] args) {

        // 1)
        System.out.println("Task 1:");
        String text1 = "Java is good";
        char[] chars1 = text1.toCharArray();
        for (char c : chars1) {
            System.out.println(c);
        }
        System.out.println();

        // 2)
        System.out.println("Task 2:");
        String text2 = "Hello World";
        char[] chars2 = text2.toCharArray();
        for (char c : chars2) {
            System.out.println(c);
        }
        System.out.println();

        // 3)
        System.out.println("Task 3:");
        String s1 = "h";
        String s2 = "k";
        int result1 = s1.compareTo(s2);
        System.out.println("Compare result: " + result1);
        System.out.println();

        // 4)
        System.out.println("Task 4:");
        String s3 = "p";
        String s4 = "L";
        int result2 = s3.compareToIgnoreCase(s4);
        System.out.println("Ignore case compare result: " + result2);
        System.out.println();

        // 5)
        System.out.println("Task 5:");
        String text3 = "Her kese salam ";
        boolean isEmpty = text3.isEmpty();
        System.out.println("Is empty: " + isEmpty);
        System.out.println();

        // 6)
        System.out.println("Task 6:");
        String text4 = "HTML is easy";
        String replaced1 = text4.replace("HTML", "CSS");
        System.out.println(replaced1);
        System.out.println();

        // 7)
        System.out.println("Task 7:");
        String text5 = "JavaScript is easy and JavaScript is worldwide programming language";
        String replaced2 = text5.replaceFirst("JavaScript", "HTML");
        System.out.println(replaced2);
        System.out.println();

        // 8) 
        System.out.println("Task 8:");
        String text6 = "James Gosling is a man who created a Java";
        String[] parts = text6.split("a");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println();
    }
}
