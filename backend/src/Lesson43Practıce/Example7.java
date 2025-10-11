package Lesson43Practıce;
import java.util.*;

public class Example7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

        String search = "Blue";
        if (colors.contains(search)) {
            System.out.println(search + " found in the list!");
        } else {
            System.out.println(search + " not found!");
        }
    }
}
