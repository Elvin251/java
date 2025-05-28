package Lesson14;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Ad: " + name);
        System.out.println("Yaş: " + age);
    }

    public static void main(String[] args) {

        Person p = new Person("Ali", 25);
        p.display();
    }
}
