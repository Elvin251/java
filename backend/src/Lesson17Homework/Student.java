package Lesson17Homework;

public class Student {
    String name;
    String surname;
    int subject1;
    int subject2;
    int subject3;

    public Student(String name, String surname, int subject1, int subject2, int subject3) {
        this.name = name;
        this.surname = surname;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public static double calculateAverage(Student student) {
        return (student.subject1 + student.subject2 + student.subject3) / 3.0;
    }

    @Override
    public String toString() {
        return "Ad: " + name + "Soyad: " + surname +
                "Ortalama: " + calculateAverage(this);
    }
}
