package Lesson14;

public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Leyla");
        s1.printName();
    }
}
