package Lesson29Practice.Task2;
public class Main {
    public static void main(String[] args) {
        String s = "Salam";
        char[] target = {'d', 'd', 'a', 'a', 'p'};

        s.getChars(0, 3, target, 0);


        String result = new String(target);
        System.out.println("Nəticə: " + result);
    }
}
