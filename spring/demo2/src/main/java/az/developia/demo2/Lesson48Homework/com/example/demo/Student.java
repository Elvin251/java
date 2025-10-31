package az.developia.demo2.Lesson48Homework.com.example.demo;


import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;
    private String surname;
    private double grade;

    public Student() {
        this.id = 1;
        this.name = "Ali";
        this.surname = "Həsənov";
        this.grade = 95.5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
