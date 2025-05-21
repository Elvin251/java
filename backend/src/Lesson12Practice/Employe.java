package Lesson12Practice;

public class Employe {
    String name;
    String position;
    double salary;

    public Employe(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', position='" + position + "', salary=" + salary + "}";
    }}
