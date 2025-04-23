public class VariablesPraktik {
    public static void main(String[] args) {
        String greeting = "Salam";
        String name = " Elvin";
        String fullGreeting = greeting +"menim adim"  + name+"dir.";

        System.out.println(fullGreeting);
        System.out.println("Uzunluq: " + fullGreeting.length());
        String myText = "Java dunyasina xos geldiniz!";
        int index = myText.indexOf('!');

        System.out.println("! işarəsinin indeksi: " + index);
        String myName = "Elvin";
        int myAge = 14;
        String myMajor = "Komputer Elmleridir";

        System.out.println("Salam, menim adim " + myName + ", " + myAge+"dir" + " yasim var. Menim ixtisasim " + myMajor + ".");
    }
}
