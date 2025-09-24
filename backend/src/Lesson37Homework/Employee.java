package Lesson37Homework;

class Employee {
    double calculateSalary() { return 0; }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        return 8000;
    }
}

class Programmer extends Employee {
    @Override
    double calculateSalary() {
        return 5000;
    }
}

 class Main4 {
    public static void main(String[] args) {
        Employee m = new Manager();
        Employee p = new Programmer();
        System.out.println("Manager Salary: " + m.calculateSalary());
        System.out.println("Programmer Salary: " + p.calculateSalary());
    }
}
