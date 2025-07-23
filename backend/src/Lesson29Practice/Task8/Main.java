package Lesson29Practice.Task8;


public class Main {

        public static void main(String[] args) {
            String s1 = "Baku Code Center";
            String s2 = "Baku Code School";

            boolean eyni = s1.regionMatches(0, s2, 0, 9);
            System.out.println("Baku Code hissesi eynidir? " + eyni);
        }}
