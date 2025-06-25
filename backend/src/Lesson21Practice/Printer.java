package Lesson21Practice;

public class Printer {

    public void printName(String name) {
        System.out.println(name);
    }

    public void printRepeated(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
