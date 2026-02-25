package Lesson81;

public class Task2 {

    public static void main(String[] args) {

        int number = 121;

        String str = String.valueOf(number);
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("Palindromdur");
        } else {
            System.out.println("Palindrom deyil");
        }
    }
}
