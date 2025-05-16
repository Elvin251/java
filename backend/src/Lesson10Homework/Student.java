package Lesson10Homework;

public class Student {
    String name;
    String surname;
    double grade;
    String major;
    String university;

    @Override
    public String toString() {
        return "Student{name='" + name + "', surname='" + surname +
                "', grade=" + grade + ", major='" + major +
                "', university='" + university + "'}";
    }
}
