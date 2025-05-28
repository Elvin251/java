package Lesson13Homework;

public class Employee {
    String name;
    String position;
    double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        this.salary += this.salary * percent / 100;
    }
}
