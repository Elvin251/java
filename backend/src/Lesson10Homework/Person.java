package Lesson10Homework;

public class Person {
    String name;
    String surname;
    String gender;
    int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', surname='" + surname +
                "', gender='" + gender + "', age=" + age + "}";
    }
}
