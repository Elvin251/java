package Lesson28Practice.Task7;

public class Main {
    public static void main(String[] args) {
        String sentence = "Java proqramlaşdırma dili";
        System.out.print("Saitlər: ");
        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
}
