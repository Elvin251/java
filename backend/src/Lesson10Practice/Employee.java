package Lesson10Practice;

public class Employee {
    String name;
    String surname;
    String job;
    double salary;

    @Override
    public String toString() {
        return "Employee{name='" + name + "', surname='" + surname +
                "', job='" + job + "', salary=" + salary + "}";
    }
}
