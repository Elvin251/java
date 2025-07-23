package Lesson29Practice;



public class WRESOURS3 {
    public static void main(String[] args) {
//        Task1
        String text1 = "Java Exercises!";
        System.out.println("Original String = " + text1);
        System.out.println("The character at position 0 is " + text1.charAt(0));
        System.out.println("The character at position 10 is " + text1.charAt(10));


//    Task2

        String text2 = "w3resource.com";
        int index = 1;
        int unicode = text2.codePointAt(index);
        System.out.println("Original String : " + text2);
        System.out.println("Character(unicode point) = " + unicode);

//        Task3
        String text3 = "w3resource.com";
        int index2= 2;
        int unicode2 = text3.codePointBefore(index2);
        System.out.println("Original String : " + text3);
        System.out.println("Character(unicode point) = " + unicode2);

//      Task5
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
        }
//        Task6
        String str3 = "This is exercise 1";
        String str4 = "This is Exercise 1";

        System.out.println("String 1: " + str3);
        System.out.println("String 2: " + str4);

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is not equal to \"" + str2 + "\"");
        }
//        Task13
        String str5 = "Stephen Edwin King";
        String str6 = "Walter Winchell";
        String str7 = "Mike Royko";

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str5.equals(str6));
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + str5.equals(str7));
//        Task14
        String str8 = "Stephen Edwin King";
        String str9 = "Walter Winchell";
        String str10 = "stephen edwin king";

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + str8.equalsIgnoreCase(str9));
        System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + str8.equalsIgnoreCase(str10));
//        Task22
        String str = "example.com";
        System.out.println("The string length of '" + str + "' is: " + str.length());
//        Task23
        String str11 = "Welcome to Microsoft";
        String str12 = "I work with Microsoft";

        boolean match1 = str11.regionMatches(11, str12, 12, 8);
        boolean match2 = str11.regionMatches(9, str12, 9, 5);

        System.out.println("str1[8 - 7] == str2[28 - 35]? " + match1);
        System.out.println("str1[9 - 15] == str2[9 - 15]? " + match2);
    }
}
