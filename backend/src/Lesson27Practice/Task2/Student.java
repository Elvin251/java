package Lesson27Practice.Task2;

public class Student {
    private int id;
    public String name;
    protected String surname;
    double gpa;

    public static int totalStudents = 0;

    public Student() {
        totalStudents++;
    }

    public Student(int id) {
        this.id = id;
        totalStudents++;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
        totalStudents++;
    }

    protected Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
        totalStudents++;
    }

    public void getInfo() {
        System.out.println("Name: " + name + " GPA: " + gpa);
    }

    private void calculateScholarship() {
        if (gpa > 3.5) {
            System.out.println("Eligible for scholarship.");
        } else {
            System.out.println("Not eligible.");
        }
    }

    protected void updateSurname(String newSurname) {
        this.surname = newSurname;
    }

    void defaultMethod() {
        System.out.println("Default method: GPA = " + gpa);
    }

    public void printStudent(final int id) {
        System.out.println("Student ID: " + id);
    }
}
