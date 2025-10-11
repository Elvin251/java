package Lesson43Practıce.Set;
import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>(Arrays.asList("Red", "Green", "Blue"));
        colors.clear();
        System.out.println("HashSet after clearing: " + colors);
    }
}
