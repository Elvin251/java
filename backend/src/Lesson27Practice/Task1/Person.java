package Lesson27Practice.Task1;
public class Person {

    public String name;
    protected int age;
    String city;
    private String password;

    public static String staticInfo = "Bu static dəyişəndir.";


    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.city = "Unknown";
        this.password = "default";
    }

    protected Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void publicMethod() {
        System.out.println("Bu public metoddur.");
    }

    protected void protectedMethod() {
        System.out.println("Bu protected metoddur.");
    }

    void defaultMethod() {
        System.out.println("Bu default metoddur.");
    }

    private void privateMethod() {
        System.out.println("Bu private metoddur.");
    }

    public void saySomethingFinal(final String message) {

        System.out.println("Mesaj: " + message);
    }
}
