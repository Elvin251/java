package Lesson11Homework;

public class Person {
    String name;
    String surname;
    String gender;
    int age;

    public Person(String n, String s, String g, int a) {
        name = n;
        surname = s;
        gender = g;
        age = a;
    }

    public void calculateAge() {
        age += 30;
        System.out.println("Age artirildi");
    }

    public String toString() {
        return "Person{name='" + name + "', surname='" + surname + "', gender='" + gender + "', age=" + age + "}";
    }
}
