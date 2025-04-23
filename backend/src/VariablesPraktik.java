public class VariablesPraktik {
    public static void main(String[] args) {
        String greeting = "Salam";
        String name = " Elvindir";
        String fullGreeting = greeting +"menim adim"  + name+".";

        System.out.println(fullGreeting);
        System.out.println("Uzunluq: " + fullGreeting.length());
        String myText = "Java dunyasina xos geldiniz!";
        int index = myText.indexOf('!');

        System.out.println("! işarəsinin indeksi: " + index);
        String myName = "Elvindir";
        int myAge = 14;
        String myMajor = "Komputer Elmleridir";

        System.out.println("Salam, menim adim " + myName + ", " + myAge + " yasim var. Menim ixtisasim " + myMajor + ".");
    }
}
