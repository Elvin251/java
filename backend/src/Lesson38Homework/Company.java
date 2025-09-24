package Lesson38Homework;


import java.util.ArrayList;

class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    void hire(Employee e) { employees.add(e); }
    void fire(Employee e) { employees.remove(e); }
    void listEmployees() {
        for (Employee e : employees) e.printInfo();
    }
}

 class Main16 {
    public static void main(String[] args) {
        Company c = new Company();
        c.hire(new Employee("Elsen","Developer",2500));
        c.hire(new Employee("Leyla","Tester",2000));
        c.listEmployees();
    }
}
