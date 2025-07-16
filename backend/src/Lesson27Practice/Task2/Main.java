package Lesson27Practice.Task2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(102, "Elvin");
        Student s4 = new Student(103, "Nigar", "Memmedova", 3.9);

        s1.getInfo();
        s4.defaultMethod();
        s2.updateSurname("Quliyev");
        s3.printStudent(102);

        System.out.println("Total students: " + Student.totalStudents);
    }
}
