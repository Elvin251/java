package Lesson29Practice.Task7;

public class Main {

        public static void main(String[] args) {
            String phone = "0709091212";
            String regex = "[0-9]{10}";

            boolean uygun = phone.matches(regex);
            System.out.println("Uygundur? " + uygun);  // true
        }


}
