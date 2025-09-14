package Lesson35Practice;

abstract class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double bonus;
    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    double calculateSalary() { return baseSalary + bonus; }
    void displayInfo() { System.out.println("Manager: " + name + ", Salary: " + calculateSalary()); }
}

class Programmer extends Employee {
    int overtimeHours;
    double overtimeRate;
    Programmer(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }
    double calculateSalary() { return baseSalary + overtimeHours * overtimeRate; }
    void displayInfo() { System.out.println("Programmer: " + name + ", Salary: " + calculateSalary()); }
}
