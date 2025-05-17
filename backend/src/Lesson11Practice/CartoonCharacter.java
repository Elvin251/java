package Lesson11Practice;

public class CartoonCharacter {
    String characterName;
 String cartoonName;
   int year;


    public CartoonCharacter(String c, String a, int y) {
       characterName = c;
        cartoonName = a;
        year = y;
    }


    public void myFavorite() {
        System.out.println("My favorite character is " + characterName + "!");
    }


    @Override
    public String toString() {
        return "Character Name: " + characterName + "\n"
                + "Cartoon Name: " + cartoonName + "\n"
                + "Year: " + year;
    }

    public static void main(String[] args) {
        CartoonCharacter character = new CartoonCharacter("Tom", "Tom and Jerry", 1940);
        character.myFavorite();
        System.out.println(character.toString());
    }
}
