package Lesson22Practice;

public class Tap4 {
    public static void main(String[] args) {
        String[] words = {"alma", "nar", "armud", "banan", "qarpız"};
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Ən uzun söz: " + longest);
    }
}
