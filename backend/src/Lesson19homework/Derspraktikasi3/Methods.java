package Lesson19homework.Derspraktikasi3;

public class Methods {

    public void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        Methods methods = new Methods();

        methods.printName(3, "Elvin");
        methods.printName(2, "Java");
        methods.printName(5, "GPT");
    }
}
