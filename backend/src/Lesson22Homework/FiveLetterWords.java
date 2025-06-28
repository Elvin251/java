package Lesson22Homework;

public class FiveLetterWords {
    public static void main(String[] args) {
        String[] words = {"alma", "kepenek", "qələm", "salam", "masa", "sözlər"};
        System.out.println("5 hərfli sözlər:");
        for (String word : words) {
            if (word.length() == 5) System.out.println(word);
        }
    }
}
