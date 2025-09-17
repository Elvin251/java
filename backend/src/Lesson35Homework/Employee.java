package Lesson35Homework;
class Employee {
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return 3000;
    }
}

class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is recruiting");
    }

    public void addEmployee() {
        System.out.println("New employee added");
    }
}

 class Main4 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }
}

