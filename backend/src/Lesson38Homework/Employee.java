package Lesson38Homework;

class Employee {
    String name, jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name; this.jobTitle = jobTitle; this.salary = salary;
    }

    void updateSalary(double newSalary) { this.salary = newSalary; }

    void printInfo() {
        System.out.println(name + " - " + jobTitle + " - $" + salary);
    }
}

class Main6 {
    public static void main(String[] args) {
        Employee e = new Employee("Elsen", "Developer", 2500);
        e.printInfo();
        e.updateSalary(3000);
        e.printInfo();
    }
}
