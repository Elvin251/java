package Lesson28Practice.Task6;

public class Main {
    public static void main(String[] args) {
        String sentence = "Bu bir nümunə cümlədir";
        if (sentence.length() > 5) {
            char ch = sentence.charAt(5);
            System.out.println("Character at index 5: " + ch);
        } else {
            System.out.println("Cümlə çox qısadır.");
        }
    }
}
