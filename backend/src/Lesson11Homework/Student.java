package Lesson11Homework;

public class Student {
    String name;
    String surname;
    int grade;
    String major;
    String university;

    public Student(String n, String s, int g, String m, String u) {
        name = n;
        surname = s;
        grade = g;
        major = m;
        university = u;
    }

    public void calculateGrade() {
        grade += 30;
        System.out.println("Grade artirildi");
    }

    public String toString() {
        return "Student{name='" + name + "', surname='" + surname + "', grade=" + grade +
                ", major='" + major + "', university='" + university + "'}";
    }
}
