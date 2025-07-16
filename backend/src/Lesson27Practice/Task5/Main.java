package Lesson27Practice.Task5;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ilham");
        Employee e3 = new Employee("Nigar", 30);
        Employee e4 = new Employee("Aydan", 28, 4500, "Developer");

        e2.promote();
        e3.showAge();
        e4.printPosition();
        e1.showDetails(1);

        System.out.println("Total employees: " + Employee.employeeCount);
    }

}
