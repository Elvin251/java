package Lesson16Homework.Task17;

public class Employee {
    String name;
    double salary;
    String department;

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    void addBonus(double bonus) {
        salary += bonus;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Leyla", 1200, "HR");
        emp.addBonus(300);
        System.out.println("Yeni maaş: " + emp.salary);
    }
}
