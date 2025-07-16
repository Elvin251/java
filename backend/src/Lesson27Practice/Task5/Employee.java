package Lesson27Practice.Task5;

public class Employee {
    public String name;
    protected int age;
    private double salary;
    String position;

    public static int employeeCount = 0;

    public Employee() {
        employeeCount++;
    }

    public Employee(String name) {
        this.name = name;
        employeeCount++;
    }

    protected Employee(String name, int age) {
        this.name = name;
        this.age = age;
        employeeCount++;
    }

    Employee(String name, int age, double salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
        employeeCount++;
    }

    public void promote() {
        System.out.println(name + " has been promoted.");
    }

    private void calculateTax() {
        double tax = salary * 0.2;
        System.out.println("Tax: $" + tax);
    }

    protected void showAge() {
        System.out.println("Age: " + age);
    }

    void printPosition() {
        System.out.println("Position: " + position);
    }

    public void showDetails(final int id) {
        System.out.println("Employee ID: " + id);
    }
}
