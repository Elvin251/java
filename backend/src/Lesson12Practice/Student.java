package Lesson12Practice;

public class Student {
    String name;
    int age;

    public Student() {
        this("No name", 0);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
