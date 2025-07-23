package Lesson29Practice.Task3;
public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        char[] target = {'a', 'a', 'd', 'd', 'a'};

        s.getChars(2, 4, target, 2);

        String result = new String(target);
        System.out.println("Nəticə: " + result);
    }
}
