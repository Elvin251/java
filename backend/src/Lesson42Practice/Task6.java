package Lesson42Practice;

import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        Optional<String> text = Optional.ofNullable("Salam");

        int length = text.map(String::length)
                .orElse(0);

        System.out.println("Uzunluq: " + length);
    }
}
