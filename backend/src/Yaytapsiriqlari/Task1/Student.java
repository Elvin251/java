package Yaytapsiriqlari.Task1;

public class Student {
    String name;
    double grade1, grade2, grade3;
    String university;

    public Student(String name, double grade1, double grade2, double grade3, String university) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.university = university;
    }

    public double average() {
        return (grade1 + grade2 + grade3) / 3;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', uni='" + university + "', ortalama=" + average() + "}";
    }
}
